package com.xervanik.xissuetracker.service;

import com.xervanik.xissuetracker.dao.Issue;
import com.xervanik.xissuetracker.repositories.IssueRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class IssueServiceImpl implements IssueService {

    Logger logger = LoggerFactory.getLogger(IssueServiceImpl.class);

    private IssueRepository issueRepo;

    @Autowired
    public IssueServiceImpl(IssueRepository issueRepo) {
        this.issueRepo = issueRepo;
    }

    @Override
    public List<Issue> getAll() {
        logger.info("Getting all Issues");
        List<Issue> issues = new ArrayList<>();
        issueRepo.findAll().forEach(issues::add);
        return issues;
    }

    @Override
    public Issue getById(Integer id) {
        logger.info("Getting 1 Issues   id : "  + id.toString());
        return issueRepo.queryById(id);
    }

    @Override
    public Issue addNew(Issue issue) {
        logger.info("Creating Issue");
        return issueRepo.save(issue);
    }

    @Override
    public Issue edit(Issue issue) {
        logger.info("Editing Issue");
        return issueRepo.save(issue);
    }

    @Override
    public void delete(Issue issue) {
        logger.info("Deleting Issue");
        issueRepo.delete(issue);
    }
}
