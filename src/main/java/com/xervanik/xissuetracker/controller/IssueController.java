package com.xervanik.xissuetracker.controller;

import com.xervanik.xissuetracker.repositories.IssueRepository;
import com.xervanik.xissuetracker.service.IssueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.context.ApplicationContext;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.servlet.http.HttpServletRequest;
import com.xervanik.xissuetracker.dao.Issue;

@Controller
public class IssueController {

    private IssueService issueService;

    @Autowired
    public IssueController(IssueService issueService) {
        this.issueService = issueService;
    }

    @RequestMapping("/issues")
    public String getIssues(Model model) {
        model.addAttribute("issues", issueService.getAll());

        return "issues";
    }
}
