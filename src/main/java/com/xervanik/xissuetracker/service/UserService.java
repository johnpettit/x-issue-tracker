package com.xervanik.xissuetracker.service;

import com.xervanik.xissuetracker.dao.User;

import java.util.List;

public interface UserService {
    List<User> getAll();

    User getById(Integer id);

    User addNew(User user);

    User edit(User user);

    void delete(User user);
    
}
