package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.CustomerRegistor;
@Repository
public interface CustomerRegistorRepository extends JpaRepository<CustomerRegistor, Long>{

//	CustomerRegistor findFirstByUsername(String username);
	boolean existsByUsernameAndPassword(String username, String password);

}
