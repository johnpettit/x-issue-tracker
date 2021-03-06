package com.xervanik.xissuetracker.controller;

import com.xervanik.xissuetracker.dao.User;
import com.xervanik.xissuetracker.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/users")
    public String getUsers(Model model) {
        model.addAttribute("users", userService.getAll());
        return "users";
    }

    @RequestMapping(value="/newuser", method = RequestMethod.GET)
    public String newUser(Model model) {
        model.addAttribute("user", new User());

        return "newuser";
    }

    @RequestMapping(value="/newuser", method = RequestMethod.POST)
    public String createIssue(@ModelAttribute User user, Model model ) {
        userService.addNew(user);

        List<User> users = userService.getAll();
        model.addAttribute("users", users);

        return "users";
    }
}
