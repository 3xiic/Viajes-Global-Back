package co.edu.unbosque.viajes_global_back.service;

import org.springframework.beans.factory.annotation.Autowired;

import co.edu.unbosque.viajes_global_back.repository.ClienteRepository;

public class ClienteService {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	public ClienteService() {
		// TODO Auto-generated constructor stub
	}

}
