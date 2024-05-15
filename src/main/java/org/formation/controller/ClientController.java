package org.formation.controller;

import java.util.List;

import org.formation.model.Client;
import org.formation.service.ClientService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("clients")
public class ClientController {

	private static final Logger LOG = LoggerFactory.getLogger(ClientController.class);
	
	ClientService service;

	public ClientController(ClientService service) {
		LOG.info("Vous êtes passé par là");
		this.service = service;
	}
	
	@GetMapping
	List<Client> getAllClients(){
		return service.getAll();
	}
	
	@PostMapping
	public Client postClient(@RequestBody @Valid Client client) {
        System.out.println("client " + client);
        return service.save(client);

	}
	
	@DeleteMapping("{id}")
	public void deleteClient(@PathVariable String id) {
		Long lid = Long.parseLong(id);
		service.deleteById(lid);
	}
	
	@GetMapping("{id}")
	Client getClientById(@PathVariable String id){
		Long lid = Long.parseLong(id);
		return service.getClientById(lid).get();
	}
	

}