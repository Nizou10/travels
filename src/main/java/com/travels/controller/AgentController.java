package com.travels.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/agent")
public class AgentController {

    @RequestMapping(value = "/show")
    public String view(final Model model) {

        model.addAttribute("user", "is agent");

        return "home";
    }
}
