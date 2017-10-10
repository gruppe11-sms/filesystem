package dk.gruppe11.file.controllers


import dk.gruppe11.file.services.storage.FileService
import dk.gruppe11.file.services.storage.IFileService
import org.springframework.core.io.Resource
import org.springframework.http.HttpHeaders
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import org.springframework.web.multipart.MultipartFile


@RestController
@RequestMapping("/api/file")
class FileController(val fileService: IFileService) {

    @PostMapping
    fun handleFileUpload(@RequestParam("file") file: MultipartFile): UploadedFile {
        val id = fileService.storeFile(file)
        return UploadedFile(id)
    }

    @GetMapping("/{id}")
    fun downloadFile(@PathVariable id: Long): ResponseEntity<Resource>? {
        val file = fileService.loadFile(id)
        return ResponseEntity
                .ok()
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"${file.fileName}\"")
                .body(file.resource)
    }


}

data class UploadedFile(val id: Long)