package co.edu.unbosque.viajes_global_back.service;

import org.springframework.beans.factory.annotation.Autowired;

import co.edu.unbosque.viajes_global_back.repository.ReservaRepository;

public class ReservaService {

	@Autowired
	private ReservaRepository reservaRepository;
	
	public ReservaService() {
		// TODO Auto-generated constructor stub
	}
	
}
