package com.example.Service;

import com.example.model.CustomerRegistor;

public interface CustomerRegistorService {



	CustomerRegistor registorcustomer(CustomerRegistor registor);

//	boolean authenticateUser(String username, String password);

	boolean authenticate(String username, String password);


}
