package com.xervanik.xissuetracker.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    Logger logger = LoggerFactory.getLogger(IndexController.class);

    @RequestMapping({"/", "", "/index"})
    public String getIndex(Model model) {
        logger.info("INDEX");
        return "index";
    }
}
