package co.edu.unbosque.viajes_global_back.service;

import co.edu.unbosque.viajes_global_back.repository.NotificationChoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
public class NotificationChoiceService {

    @Autowired
    private NotificationChoiceRepository notificationChoiceRepository;

    public NotificationChoiceService() {

    }
}
