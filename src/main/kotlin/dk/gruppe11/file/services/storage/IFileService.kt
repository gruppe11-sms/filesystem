package dk.gruppe11.file.services.storage

import org.springframework.core.io.Resource
import org.springframework.web.multipart.MultipartFile

interface IFileService {

    fun storeFile(file: MultipartFile) : Long

    fun loadFile(id: Long): FileResourse
}