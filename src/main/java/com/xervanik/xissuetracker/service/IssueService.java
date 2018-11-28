package com.xervanik.xissuetracker.service;

import com.xervanik.xissuetracker.dao.Issue;

import java.util.List;

public interface IssueService {
    List<Issue> getAll();

    Issue getById(Integer id);

    Issue addNew(Issue issue);

    Issue edit(Issue issue);

    void delete(Issue issue);
}
