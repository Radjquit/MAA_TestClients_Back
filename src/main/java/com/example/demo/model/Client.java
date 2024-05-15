package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Client {
	private String firstname;
	private String lastname;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	public Client(String firstname, String lastname) {
		this.firstname = firstname;
		this.lastname = lastname;
	}
	
	public Client() {
	}

//	public Client(String lastname, String firstname) {
//		this(lastname, firstname, UUID.randomUUID().toString());
//	}

	
	
	public String getFirstname() {
		return firstname;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	

}
