package org.formation.service;

import java.util.List;
import java.util.Optional;

import org.formation.model.Client;

public interface ClientService {

	List<Client> getAll();
	Client save(Client client);
	public Optional<Client> getClientById(Long id);
	void deleteById(Long id);
}
