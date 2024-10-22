package co.edu.unbosque.viajes_global_back.service;

import org.springframework.beans.factory.annotation.Autowired;

import co.edu.unbosque.viajes_global_back.repository.PackageRepository;
import org.springframework.stereotype.Service;

@Service
public class PackageService {

	@Autowired
	private PackageRepository packageRepository;
	
	public PackageService() {
		// TODO Auto-generated constructor stub
	}
	
}
