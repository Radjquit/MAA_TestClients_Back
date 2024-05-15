package org.formation.service;

import java.util.List;
import java.util.Optional;

import org.formation.model.Client;
import org.formation.repository.ClientRepository;
import org.springframework.stereotype.Service;

@Service
public class ClientServiceImpl implements ClientService {
	
//	List<Client> clients = new ArrayList<>();
	
	private ClientRepository repository;
	
	public ClientServiceImpl(ClientRepository cRepository) {
		super();
		this.repository = cRepository;
	}

//	public ClientServiceImpl() {
//		clients.addAll(List.of(
//				new Client("Chloé", "Spaak"),
//				new Client("Marine", "Spaak"),
//				new Client("Antoine", "Dupont", new Account()),
//				new Client("Romain", "Ntamack", new Account(10928))
//				));
//	}



	@Override
	public List<Client> getAll() {
		return repository.findAll();
	}



	@Override
	public Client save(Client client) {
		return repository.save(client);
	}
	
	@Override
	public Optional<Client> getClientById(Long id) {
		return repository.findById(id);
	}

	@Override
	public void deleteById(Long id) {
		repository.deleteById(id);
	}

}
