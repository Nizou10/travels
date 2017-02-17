package com.travels.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.travels.entities.Client;
import com.travels.service.ClientService;

@Controller
public class ClientController {

    @Resource(name = "clientService")
    ClientService clientService;

    @RequestMapping(value = "/")
    public String index(final Model model) {
        final List<Client> allClients = clientService.findAllClients();
        model.addAttribute("allClients", allClients);
        return "home";

    }
}
