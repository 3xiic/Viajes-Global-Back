package co.edu.unbosque.viajes_global_back.service;

import co.edu.unbosque.viajes_global_back.repository.BookingDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingDetailService {
    @Autowired
    private BookingDetailRepository bookingDetailRepository;


}


