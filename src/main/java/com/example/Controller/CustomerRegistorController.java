package com.example.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Service.CustomerRegistorService;
import com.example.model.CustomerRegistor;

@CrossOrigin
@RestController
@RequestMapping("/api/customerregistor")
public class CustomerRegistorController {

    @Autowired
	private CustomerRegistorService  registorservice;

	public CustomerRegistorController(CustomerRegistorService registorservice) {
		super();
		this.registorservice = registorservice;
	}
	
	@PostMapping
    public CustomerRegistor registorcustomer(@RequestBody CustomerRegistor registor) {
		return registorservice.registorcustomer(registor);
    	
    }
//	 @PostMapping("/login")
//	    public ResponseEntity<String> login(@RequestBody  CustomerRegistor registor) {
//	        boolean isAuthenticated =registorservice.authenticateUser(registor.getUsername(), registor.getPassword());
//	        if (isAuthenticated) {
//	            return ResponseEntity.ok("Login successful");
//	        } else {
//	            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid username or password");
//	            
//	        }
//	    }
	 
	@PostMapping("/login")
	public ResponseEntity<String> login(@RequestBody CustomerRegistor registor) {
		if (registorservice.authenticate(registor.getUsername(), registor.getPassword())) {
			return ResponseEntity.ok("Login successful");
		} else {
			return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Incorrect username or password");
		}
	}
	}

