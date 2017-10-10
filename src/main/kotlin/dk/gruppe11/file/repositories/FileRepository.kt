package dk.gruppe11.file.repositories

import dk.gruppe11.file.models.FileEntity
import org.springframework.data.repository.CrudRepository

interface FileRepository : CrudRepository<FileEntity, Long>{
}