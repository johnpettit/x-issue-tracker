package com.xervanik.xissuetracker.service;

import com.xervanik.xissuetracker.dao.Issue;
import com.xervanik.xissuetracker.repositories.IssueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class IssueServiceImpl implements IssueService {
    private IssueRepository issueRepo;

    @Autowired
    public IssueServiceImpl(IssueRepository issueRepo) {
        this.issueRepo = issueRepo;
    }

    @Override
    public List<Issue> getAll() {
        List<Issue> issues = new ArrayList<>();
        issueRepo.findAll().forEach(issues::add);
        return issues;
    }

    @Override
    public Issue getById(Integer id) {
        return issueRepo.queryById(id);
    }

    @Override
    public Issue addNew(Issue issue) {
        return issueRepo.save(issue);
    }

    @Override
    public Issue edit(Issue issue) {
        return issueRepo.save(issue);
    }

    @Override
    public void delete(Issue issue) {
        issueRepo.delete(issue);
    }
}
