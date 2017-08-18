package com.crud.test.dao;

import com.crud.test.domain.fostergem.RecentVisitorsDomain;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecentVisitorRepository extends JpaRepository <RecentVisitorsDomain,Integer>
{

}
