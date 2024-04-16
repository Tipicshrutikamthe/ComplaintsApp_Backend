package com.example.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Service.AuthorityService;
import com.example.model.Authority;
import com.example.model.Complaints;

@CrossOrigin
@RestController
@RequestMapping("/api/authority")
public class AuthorityController {

	 @Autowired
	 private AuthorityService authorityservice;

	public AuthorityController(AuthorityService authorityservice) {
		super();
		this.authorityservice = authorityservice;
	}
	@PostMapping
    public Authority registerAuthority(@RequestBody Authority authority) {
        return authorityservice.registerAuthority(authority);
    }
    
    @GetMapping
    public List<Authority> getAuthority() {
       return authorityservice.getAllAuthority();
   }
    @GetMapping("/{id}")
    public ResponseEntity<Authority> getAuthorityById(@PathVariable("id")Long id) {
    	Authority authority = authorityservice.getAuthorityById(id);
        if (authority == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(authority);
    }
 
   
 @DeleteMapping("/{id}")
    public ResponseEntity<Authority> deleteAuthority(@PathVariable Long id) {
	 authorityservice.deleteAuthority(id);
        return ResponseEntity.noContent().build();
    }
}
