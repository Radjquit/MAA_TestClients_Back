package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Client;
import com.example.demo.service.IServiceClient;

import jakarta.validation.Valid;

@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("clients")
public class ClientController {
	
	private IServiceClient service;

	public ClientController(IServiceClient service) {
		this.service = service;
	}
	
	@GetMapping
	List<Client> getAllClients() {
		return service.getAllClient();
	}
	
	@PostMapping	
	public Client postClient(@RequestBody @Valid Client client) {
		//Client newClient = new Client(client.getLastname(), client.getFirstname());
		System.out.println("client " + client);
		return service.save(client);
	}
	
	@DeleteMapping("{id}")
	public void deleteClient(@PathVariable Long id) {
		service.delete(id);
	}
	

}
