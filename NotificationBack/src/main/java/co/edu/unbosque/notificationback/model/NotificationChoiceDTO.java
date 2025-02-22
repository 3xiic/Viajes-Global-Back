package co.edu.unbosque.notificationback.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class NotificationChoiceDTO {

    private int id_client;
    private boolean choice_push;
    private boolean choice_sms;
    private boolean choice_email;

    public NotificationChoiceDTO() {

    }
    public NotificationChoiceDTO(int  id_client, boolean choice_push, boolean choice_sms, boolean choice_email) {
        this.id_client = id_client;
        this.choice_push = choice_push;
        this.choice_sms = choice_sms;
        this.choice_email = choice_email;
    }
}
