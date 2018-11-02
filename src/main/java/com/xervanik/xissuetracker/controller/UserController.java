package com.xervanik.xissuetracker.controller;

import com.xervanik.xissuetracker.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    private UserRepository userRepo;

    @Autowired
    public UserController(UserRepository userRepo) {
        this.userRepo = userRepo;
    }

    @RequestMapping("/users")
    public String getUsers(Model model) {
        model.addAttribute("users", userRepo.findAll());
        return "users";
    }
}
