package com.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Authority {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String name;
	    private String password;
	    private String contact;
	    private String email;
	    
		@Override
		public String toString() {
			return "Authority [id=" + id + ", name=" + name + ", password=" + password + ", contact=" + contact
					+ ", email=" + email + "]";
		}
		public Authority() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Authority(Long id, String name, String password, String contact, String email) {
			super();
			this.id = id;
			this.name = name;
			this.password = password;
			this.contact = contact;
			this.email = email;
		}
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getContact() {
			return contact;
		}
		public void setContact(String contact) {
			this.contact = contact;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
	    
}
