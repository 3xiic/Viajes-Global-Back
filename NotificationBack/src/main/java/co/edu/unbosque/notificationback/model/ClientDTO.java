package co.edu.unbosque.notificationback.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
public class ClientDTO {

    private int id_client;
    private String email;
    private String user;
    private String telephone;
    private String password;
    private Set<Long> bookingIds;
    private Long notificationChoiceId;
    public ClientDTO() {

    }

    public ClientDTO(int id_client, String email, String user, String telephone, String password, Set<Long> bookingIds, Long notificationChoiceId) {
        this.id_client = id_client;
        this.email = email;
        this.user = user;
        this.telephone = telephone;
        this.password = password;
        this.bookingIds = bookingIds;
        this.notificationChoiceId = notificationChoiceId;
    }
}
