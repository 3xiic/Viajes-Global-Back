package co.edu.unbosque.viajes_global_back.service;

import org.springframework.beans.factory.annotation.Autowired;

import co.edu.unbosque.viajes_global_back.repository.VueloRepository;

public class VueloService {

	@Autowired
	private VueloRepository vueloRepository;
	
	public VueloService() {
		// TODO Auto-generated constructor stub
	}
}
