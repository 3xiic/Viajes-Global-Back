package co.edu.unbosque.viajes_global_back.service;

import org.springframework.beans.factory.annotation.Autowired;

import co.edu.unbosque.viajes_global_back.repository.ActividadRepository;

public class ActividadService {

	@Autowired
	private ActividadRepository actividadRepository;
	
	public ActividadService() {
		// TODO Auto-generated constructor stub
	}
	
}
