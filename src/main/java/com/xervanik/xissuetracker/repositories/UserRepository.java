package com.xervanik.xissuetracker.repositories;

import com.xervanik.xissuetracker.dao.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
}
