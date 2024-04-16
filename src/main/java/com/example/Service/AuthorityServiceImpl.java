 package com.example.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Repository.AuthorityRepository;
import com.example.Repository.ComplaintsRepository;
import com.example.model.Authority;
import com.example.model.Complaints;
@Service
public class AuthorityServiceImpl implements AuthorityService {
	
	 @Autowired
	    private AuthorityRepository authorityRepository;


	 
	@Override
	public List<Authority> getAllAuthority() {
		return authorityRepository.findAll();
	}

	@Override
	public void deleteAuthority(Long id) {
		authorityRepository.deleteById(id);

	}

	@Override
	public Authority getAuthorityById(Long id) {
	 return authorityRepository.findById(id).orElse(null);

	}

	@Override
	public Authority registerAuthority(Authority authority) {
		return authorityRepository.save(authority);
	}

	
}
