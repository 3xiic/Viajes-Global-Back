package co.edu.unbosque.viajes_global_back.service;

import org.springframework.beans.factory.annotation.Autowired;

import co.edu.unbosque.viajes_global_back.repository.HotelRepository;

public class HotelService {

	@Autowired
	private HotelRepository hotelRepository;
	
	public HotelService() {
		// TODO Auto-generated constructor stub
	}
	
}
