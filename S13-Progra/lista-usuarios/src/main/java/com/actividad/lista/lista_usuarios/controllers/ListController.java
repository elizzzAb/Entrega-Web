package com.actividad.lista.lista_usuarios.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.actividad.lista.lista_usuarios.services.UserService;

@Controller
public class ListController {

    @Autowired
    private UserService userService;

    @GetMapping("/vista")
    public String getUserList(Model model) {
        model.addAttribute("users", userService.getAllUsers());
        return "list";
    }

}
