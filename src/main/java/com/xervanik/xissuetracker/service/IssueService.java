package com.xervanik.xissuetracker.service;

import com.xervanik.xissuetracker.dao.Issue;

import java.util.List;

public interface IssueService {
    List<Issue> getAll();
}
