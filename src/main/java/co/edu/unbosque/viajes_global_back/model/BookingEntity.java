package co.edu.unbosque.viajes_global_back.model;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "reservas")
@Getter
@Setter
public class BookingEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_booking;
    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_client", referencedColumnName = "id_client")
    private ClientEntity clientEntity;
    private int id_client;
    private int id_package;
    private Date booking_date;
    private String booking_status;
    private String name;
    private String email;
    private String telephone;
    @JsonManagedReference
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_package", referencedColumnName = "id_package")
    private PackageEntity packageEntity;
    @JsonManagedReference
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_booking", referencedColumnName = "id_booking")
    private BookingDetailEntity bookingDetailEntity;


    public BookingEntity() {

    }

    public BookingEntity(int id_booking, ClientEntity clientEntity, int id_client, int id_package, Date booking_date, String booking_status, String name, String email, String telephone, PackageEntity packageEntity, BookingDetailEntity bookingDetailEntity) {
        this.id_booking = id_booking;
        this.clientEntity = clientEntity;
        this.id_client = id_client;
        this.id_package = id_package;
        this.booking_date = booking_date;
        this.booking_status = booking_status;
        this.name = name;
        this.email = email;
        this.telephone = telephone;
        this.packageEntity = packageEntity;
        this.bookingDetailEntity = bookingDetailEntity;
    }
}