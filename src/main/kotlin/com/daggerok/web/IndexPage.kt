package com.daggerok.web

import com.daggerok.domain.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping

/**
 * Created by mak on 8/5/16.
 */
@Controller
class IndexPage @Autowired constructor(val userRepository: UserRepository) {

    @RequestMapping("/")
    fun index(model: Model): String {
        model.addAttribute("users", userRepository.findAll())
        return "index"
    }
}
