package dk.group11.file.models

import javax.persistence.*

@Entity
@Table(name = "file")
data class FileEntity(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        var id : Long = 0,
        var fileName : String = "",
        var originalFileName : String = ""
)