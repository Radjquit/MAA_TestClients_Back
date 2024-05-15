package org.formation.model;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;

@Entity
public class Client {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotEmpty(message = "Your client must have a firstName")
	private String firstName;
	@NotEmpty(message = "Your client must have a lastName")
	private String lastName;
	private String login;
	private String password;
	@Embedded
	private Adresse adress;
	

	public Client(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public Client() {
		
	}
	

	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}
	

	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	

	public String getLogin() {
		return login;
	}

	
	public void setLogin(String login) {
		this.login = login;
	}

	
	public String getPassword() {
		return password;
	}

	
	public void setPassword(String password) {
		this.password = password;
	}
	

	public Adresse getAdress() {
		return adress;
	}
	

	public void setAdress(Adresse adress) {
		this.adress = adress;
	}


	
	
	
}
