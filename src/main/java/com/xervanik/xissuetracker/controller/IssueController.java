package com.xervanik.xissuetracker.controller;

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

    @RequestMapping("/issues")
    public String getIssues(Model model, HttpServletRequest request) {
        ApplicationContext appContext = WebApplicationContextUtils.getWebApplicationContext(request.getServletContext());
        EntityManagerFactory emf = appContext.getBean(EntityManagerFactory.class);
        EntityManager em = emf.createEntityManager();
        model.addAttribute("issues", em.createQuery("from Issue", Issue.class).getResultList());
        return "issues";
    }
}
