package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Authority;


@Repository
public interface AuthorityRepository  extends JpaRepository<Authority, Long>{
	

}
