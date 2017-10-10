package dk.gruppe11.file

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class FileApplication

fun main(args: Array<String>) {
    SpringApplication.run(FileApplication::class.java, *args)
}
