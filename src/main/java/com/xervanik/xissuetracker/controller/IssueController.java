package com.xervanik.xissuetracker.controller;

import com.xervanik.xissuetracker.service.IssueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.xervanik.xissuetracker.dao.Issue;
import java.util.List;

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

    @RequestMapping(value="/newissue", method = RequestMethod.GET)
    public String newIssue(Model model) {
        model.addAttribute("issue", new Issue());

        return "newissue";
    }

    @RequestMapping(value="/newissue", method = RequestMethod.POST)
    public String createIssue(@ModelAttribute Issue issue, Model model ) {
        issueService.addNew(issue);

        List<Issue> issues = issueService.getAll();
        model.addAttribute("issues", issues);

        return "issues";
    }
}
