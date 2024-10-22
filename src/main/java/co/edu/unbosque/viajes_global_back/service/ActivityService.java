package co.edu.unbosque.viajes_global_back.service;

import org.springframework.beans.factory.annotation.Autowired;

import co.edu.unbosque.viajes_global_back.repository.ActivityRepository;
import org.springframework.stereotype.Service;

@Service
public class ActivityService {

	@Autowired
	private ActivityRepository activityRepository;
	
	public ActivityService() {
		// TODO Auto-generated constructor stub
	}
	
}
