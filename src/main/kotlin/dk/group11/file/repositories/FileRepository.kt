package dk.group11.file.repositories

import dk.group11.file.models.FileEntity
import org.springframework.data.repository.CrudRepository

interface FileRepository : CrudRepository<FileEntity, Long>