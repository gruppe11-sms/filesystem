package dk.group11.file.services.storage

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Configuration

@Configuration
@ConfigurationProperties("storage")
data class FileProperties(var location : String = "storage")