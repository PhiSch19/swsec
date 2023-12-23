package at.phisch.swsec

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SwsecApplication

fun main(args: Array<String>) {
    runApplication<SwsecApplication>(*args)
}
