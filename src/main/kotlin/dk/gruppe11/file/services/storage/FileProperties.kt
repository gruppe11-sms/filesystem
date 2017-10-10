package dk.gruppe11.file.services.storage

import org.springframework.boot.context.properties.ConfigurationProperties

@ConfigurationProperties("storage")
data class FileProperties(var location : String = "storage")