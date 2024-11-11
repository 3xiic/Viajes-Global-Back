package co.edu.unbosque.bookingback.model;

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
    private int id_client;
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
    @JoinColumn(name = "id_booking_detail")
    private BookingDetailEntity bookingDetailEntity;


    public BookingEntity() {

    }

    public BookingEntity(int id_booking, int id_client, Date booking_date, String booking_status, String name, String email, String telephone, PackageEntity packageEntity, BookingDetailEntity bookingDetailEntity) {
        this.id_booking = id_booking;
        this.id_client = id_client;
        this.booking_date = booking_date;
        this.booking_status = booking_status;
        this.name = name;
        this.email = email;
        this.telephone = telephone;
        this.packageEntity = packageEntity;
        this.bookingDetailEntity = bookingDetailEntity;
    }
}