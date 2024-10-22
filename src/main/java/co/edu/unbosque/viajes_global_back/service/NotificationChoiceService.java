package co.edu.unbosque.viajes_global_back.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
public class NotificationChoiceService {

    @Autowired
    @Lazy
    private NotificationChoiceService notificationChoiceService;

    public NotificationChoiceService() {

    }
}
