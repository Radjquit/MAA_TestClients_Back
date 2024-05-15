package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.model.Client;
import com.example.demo.repository.ClientRepository;

@Service
public class ClientServImpl implements IServiceClient {
	//private List<Client> clients = new ArrayList<>();
	
//	public ClientServImpl() {
//		clients.addAll(List.of(new Client("Jean", "Dupont"), new Client("Jane", "Doe"), new Client("John", "Doe"), new Client("blublu", "blabla")
//
//				));
//	}
//
	
	private ClientRepository repo;
	
	public ClientServImpl(ClientRepository repo) {
		this.repo = repo;
	}

	@Override
	public List<Client> getAllClient() {
		return repo.findAll();
	}

	@Override
	public Client save(Client client) {
		return repo.save(client);
	}
	
	
	@Override
	public Optional<Client> getClientById(String id) {
		return Optional.empty();
	}


	@Override
	public void delete(Long id) {
		repo.deleteById(id) ;
	}

}
