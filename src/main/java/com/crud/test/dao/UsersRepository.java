package com.crud.test.dao;

import com.crud.test.domain.fostergem.UsersDomain;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<UsersDomain,Integer> {
    UsersDomain findByEmail(String email);
    UsersDomain findByEmailAndPassword(String email, String password);
}
