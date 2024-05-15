package org.bank.service;

import org.bank.model.Client;

import java.util.List;
import java.util.Optional;

public interface ClientService {
    List<Client> getAll();
    Optional<Client> getById(long id);
    boolean deleteById(long id);
    Client update(Client client);
    Client save(Client client);
}
