package com.crud.test.dao;

import com.crud.test.domain.UserNameDomain;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

@Transactional
 public interface UserNameRepository extends JpaRepository<UserNameDomain,Integer> {

}
