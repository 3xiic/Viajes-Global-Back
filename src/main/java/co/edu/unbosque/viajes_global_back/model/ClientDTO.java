package co.edu.unbosque.viajes_global_back.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.OneToMany;
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
    @JsonManagedReference
    private Set<BookingEntity> bookingEntities;
    private NotificationChoiceEntity notificationChoiceEntity;
    public ClientDTO() {

    }

    public ClientDTO(int id_client, String email, String user, String telephone, String password, Set<BookingEntity> bookingEntities, NotificationChoiceEntity notificationChoiceEntity) {
        this.id_client = id_client;
        this.email = email;
        this.user = user;
        this.telephone = telephone;
        this.password = password;
        this.bookingEntities = bookingEntities;
        this.notificationChoiceEntity = notificationChoiceEntity;
    }
}
