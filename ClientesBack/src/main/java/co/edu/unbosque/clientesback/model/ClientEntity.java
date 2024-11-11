package co.edu.unbosque.clientesback.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Table(name = "clientes")
@Getter
@Setter
public class ClientEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_client;
    private String email;
    private String username;
    private String telephone;
    private String password;
    @ElementCollection
    private Set<Long> bookingIds;
    private Long notificationChoiceId;
    public ClientEntity() {

    }

    public ClientEntity(int id_client, String email, String username, String telephone, String password, Set<Long> bookingIds, Long notificationChoiceId) {
        this.id_client = id_client;
        this.email = email;
        this.username = username;
        this.telephone = telephone;
        this.password = password;
        this.bookingIds = bookingIds;
        this.notificationChoiceId = notificationChoiceId;
    }
}
