package com.xervanik.xissuetracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.xervanik.xissuetracker.dao.Issue;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.util.Date;

@SpringBootApplication
public class XIssueTrackerApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(XIssueTrackerApplication.class, args);

        EntityManagerFactory entManFac = context.getBean(EntityManagerFactory.class);
        EntityManager enMan = entManFac.createEntityManager();

        enMan.getTransaction().begin();

        Issue issue1 = new Issue();
        issue1.setId(1);
        issue1.setTitle("TEST1");
        issue1.setCreateDate(new Date());

        enMan.merge(issue1);

        Issue issue2 = new Issue();
        issue2.setId(2);
        issue2.setTitle("TEST2");
        issue2.setCreateDate(new Date());

        enMan.merge(issue2);

        enMan.getTransaction().commit();

    }
}
