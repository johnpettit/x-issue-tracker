package com.xervanik.xissuetracker.repositories;

import com.xervanik.xissuetracker.dao.Issue;
import org.springframework.data.repository.CrudRepository;

public interface IssueRepository extends CrudRepository<Issue, Integer> {
}
