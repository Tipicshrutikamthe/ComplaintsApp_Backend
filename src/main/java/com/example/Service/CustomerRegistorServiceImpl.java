package com.example.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Repository.CustomerRegistorRepository;
import com.example.model.CustomerRegistor;
@Service
public class CustomerRegistorServiceImpl  implements CustomerRegistorService{
    @Autowired
	private CustomerRegistorRepository registorrepository;

	@Override
	public CustomerRegistor registorcustomer(CustomerRegistor registor) {
		return registorrepository.save(registor);
	}
//	 @Override
//	    public boolean authenticateUser(String username, String password) {
//	        CustomerRegistor customer = registorrepository.findFirstByUsername(username);
//
//	        return customer != null && customer.getPassword().equals(password);
//
//	    }

	@Override
	public boolean authenticate(String username, String password) {
		return registorrepository.existsByUsernameAndPassword(username, password);
	}

	
}
