package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.model.Client;

public interface IServiceClient {
	List<Client> getAllClient();
	Client save(Client client);
	Optional<Client> getClientById(String id);
	void delete(Long id);

}
