package com.crud.test.dao;

import com.crud.test.domain.DetailUserDomain;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

@Transactional
public interface DetailUserRepository extends JpaRepository<DetailUserDomain,Integer> {
}
