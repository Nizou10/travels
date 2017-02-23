package com.travels.controller;

import javax.annotation.Resource;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.travels.entities.User;
import com.travels.service.UserService;

@Controller
public class UserController {

    @Resource(name = "clientService")
    UserService userService;

    @RequestMapping(value = "/index")
    public String index(final Model model, @RequestParam(name = "page", defaultValue = "0") final int page, @RequestParam(name = "searchName",
            defaultValue = "") final String name) {
        final Page<User> allUsers = userService.search("%" + name + "%", new PageRequest(page, 5));

        model.addAttribute("currentPage", page);
        model.addAttribute("searchName", name);
        model.addAttribute("pageUsers", allUsers);
        return "home";

    }

}
