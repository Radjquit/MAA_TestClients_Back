package org.bank.persistance;

import org.bank.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ClientPersistance{
    List<Client> getAll();
    Optional<Client> getById(long id);
    boolean deleteById(long id);
    Client update(Client client);
    Client save(Client client);

}
