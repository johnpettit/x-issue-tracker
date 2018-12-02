package com.xervanik.xissuetracker.repositories;

import com.xervanik.xissuetracker.dao.Issue;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface IssueRepository extends CrudRepository<Issue, Integer> {
    Issue queryById(Integer id);

    void delete(Issue issue);
}
