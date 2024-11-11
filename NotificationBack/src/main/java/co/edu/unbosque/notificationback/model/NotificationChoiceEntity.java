package co.edu.unbosque.notificationback.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "eleccion_notificacion")
@Getter
@Setter
public class NotificationChoiceEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_client;
    private boolean choice_push;
    private boolean choice_sms;
    private boolean choice_email;

    public NotificationChoiceEntity() {

    }

    public NotificationChoiceEntity( int  id_client, boolean choice_push, boolean choice_sms, boolean choice_email) {
        this.id_client = id_client;
        this.choice_push = choice_push;
        this.choice_sms = choice_sms;
        this.choice_email = choice_email;
    }
}
