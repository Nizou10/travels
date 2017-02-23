package com.travels.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @RequestMapping(value = "/lists", method = RequestMethod.GET)
    public String index(final Model model) {
        model.addAttribute("user", "is admin");
        return "home";

    }

}
