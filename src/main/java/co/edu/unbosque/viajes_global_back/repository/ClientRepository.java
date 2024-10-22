package co.edu.unbosque.viajes_global_back.repository;

import org.springframework.data.repository.CrudRepository;

import co.edu.unbosque.viajes_global_back.model.ClientEntity;

public interface ClientRepository extends CrudRepository<ClientEntity, Integer> {
    ClientEntity findByUser(String user);

}
