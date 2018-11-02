package com.xervanik.xissuetracker.bootstrap;

import com.xervanik.xissuetracker.dao.Issue;
import com.xervanik.xissuetracker.dao.User;
import com.xervanik.xissuetracker.repositories.IssueRepository;
import com.xervanik.xissuetracker.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import java.util.Date;

@Component
public class Boots implements ApplicationListener<ContextRefreshedEvent> {

    private IssueRepository issueRepo;
    private UserRepository userRepo;

    @Autowired
    public Boots(IssueRepository issueRepo, UserRepository userRepo) {
        this.issueRepo = issueRepo;
        this.userRepo = userRepo;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        Issue issue1 = new Issue();
        issue1.setId(1);
        issue1.setTitle("TEST1");
        issue1.setCreateDate(new Date());

        issueRepo.save(issue1);

        Issue issue2 = new Issue();
        issue2.setId(2);
        issue2.setTitle("TEST2");
        issue2.setCreateDate(new Date());

        issueRepo.save(issue2);

        User user = new User();
        user.setId(1);
        user.setFirstName("John");
        user.setLastName("Pettit");
        user.setEmail("john.pettit@cox.net");
        user.setCreateDate(new Date());

        userRepo.save(user);
    }
}
