package at.phisch.swsec

import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import kotlin.random.Random

@RestController
class PwController {

    @GetMapping("pw/generate")
    @CrossOrigin
    fun pw(@RequestParam count: Int): Array<String> {
        val charPool : List<Char> = ('a'..'z') + ('A'..'Z') + ('0'..'9');
        return Array(count) { i ->
            (1..10)
                    .map { Random.nextInt(0, charPool.size).let { charPool[it] } }
                    .joinToString("")
        };
    }

}