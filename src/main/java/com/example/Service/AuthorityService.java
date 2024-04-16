package com.example.Service;

import java.util.List;

import com.example.model.Authority;
import com.example.model.Complaints;

public interface AuthorityService {

	Authority registerAuthority(Authority authority);

	 List<Authority> getAllAuthority();
		
	 void deleteAuthority(Long id);

	Authority getAuthorityById(Long id);

}
