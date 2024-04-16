package com.example.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Complaints;

@Repository
public interface ComplaintsRepository extends JpaRepository<Complaints, Long> {

	
}

