package dk.group11.file.services.storage

import org.springframework.web.multipart.MultipartFile

interface IFileService {

    fun storeFile(file: MultipartFile) : Long

    fun loadFile(id: Long): FileResourse
}