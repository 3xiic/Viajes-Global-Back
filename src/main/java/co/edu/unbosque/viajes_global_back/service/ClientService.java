package co.edu.unbosque.viajes_global_back.service;

import co.edu.unbosque.viajes_global_back.model.ClientDTO;
import co.edu.unbosque.viajes_global_back.model.ClientEntity;
import org.springframework.beans.factory.annotation.Autowired;

import co.edu.unbosque.viajes_global_back.repository.ClientRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class ClientService {
	
	@Autowired
	private ClientRepository clientRepository;
	private PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

	public ClientDTO registerClient(ClientDTO clientDTO){
		String encryptedPassword = passwordEncoder.encode(clientDTO.getPassword());

		ClientEntity clientEntity = new ClientEntity(
				clientDTO.getId_client(),
				clientDTO.getEmail(),
				clientDTO.getUser(),
				clientDTO.getTelephone(),
				encryptedPassword,
				clientDTO.getBookingEntities(),
				clientDTO.getNotificationChoiceEntity()
		);

		clientRepository.save(clientEntity);

		return clientDTO;
	}

	public boolean validatePassword(String password, String encondedPassword){
		return passwordEncoder.matches(password,encondedPassword);
	}

	public ClientEntity findByUser(String user){
		return clientRepository.findByUser(user);
	}
	public ClientService() {

	}

}
