package co.edu.unbosque.viajes_global_back.service;

import co.edu.unbosque.viajes_global_back.model.ClientDTO;
import co.edu.unbosque.viajes_global_back.model.ClientEntity;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;

import co.edu.unbosque.viajes_global_back.repository.ClientRepository;
import org.springframework.stereotype.Service;

@Service
public class ClientService {
	
	@Autowired
	private ClientRepository clientRepository;

	public ClientDTO registerClient(ClientDTO clientDTO){
	String hashedPassword = DigestUtils.sha256Hex(clientDTO.getPassword());

		ClientEntity clientEntity = new ClientEntity(
				clientDTO.getId_client(),
				clientDTO.getEmail(),
				clientDTO.getUser(),
				clientDTO.getTelephone(),
				hashedPassword,
				clientDTO.getBookingEntities(),
				clientDTO.getNotificationChoiceEntity()
		);

		clientRepository.save(clientEntity);

		return clientDTO;
	}
	public boolean validatePassword(String password, String hashedPassword) {
		String hashedInputPassword = DigestUtils.sha256Hex(password);
		return hashedInputPassword.equals(hashedPassword);
	}


	public ClientEntity findByUser(String user){
		return clientRepository.findByUser(user);
	}
	public ClientService() {

	}

}
