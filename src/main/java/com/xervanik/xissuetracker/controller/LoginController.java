package com.xervanik.xissuetracker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
    @RequestMapping({"/login"})
    public String getIndex(Model model) {
        return "login";
    }
}
