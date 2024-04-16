package com.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class CustomerRegistor {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String username;
	    private String contact;
	    private String emailid;
	    private String password;
		public CustomerRegistor(Long id, String username, String contact, String emailid, String password) {
			super();
			this.id = id;
			this.username = username;
			this.contact = contact;
			this.emailid = emailid;
			this.password = password;
		}
		@Override
		public String toString() {
			return "CustomerRegistor [id=" + id + ", username=" + username + ", contact=" + contact + ", emailid="
					+ emailid + ", password=" + password + "]";
		}
		public CustomerRegistor() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getContact() {
			return contact;
		}
		public void setContact(String contact) {
			this.contact = contact;
		}
		public String getEmailid() {
			return emailid;
		}
		public void setEmailid(String emailid) {
			this.emailid = emailid;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		
	    
}
