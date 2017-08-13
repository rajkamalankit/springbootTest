package com.crud.test.dao;

import com.crud.test.domain.ToDoListDomain;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

@Transactional
public interface ToDoListRepository extends JpaRepository<ToDoListDomain, Integer> {

}
