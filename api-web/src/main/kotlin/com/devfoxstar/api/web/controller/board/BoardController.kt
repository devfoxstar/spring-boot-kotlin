package com.devfoxstar.api.web.controller.board

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/board/")
class BoardController {

    @GetMapping(value = ["list"])
    fun getList(): String {
        return "Hello World"
    }

}