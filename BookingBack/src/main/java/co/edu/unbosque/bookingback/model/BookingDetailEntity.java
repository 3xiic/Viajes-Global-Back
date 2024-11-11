package co.edu.unbosque.bookingback.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "detalle_reservas_vuelos")
@Getter
@Setter
public class BookingDetailEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_booking_detail;
    private int id_booking;
    private int id_flight;
    private int num_adult;
    private int num_child;
    @JsonBackReference
    @OneToOne(mappedBy = "bookingDetailEntity")
    private BookingEntity bookingEntity;

    public BookingDetailEntity() {

    }

    public BookingDetailEntity(int id_booking_detail, int id_booking, int id_flight, int num_adult, int num_child, BookingEntity bookingEntity) {
        this.id_booking_detail = id_booking_detail;
        this.id_booking = id_booking;
        this.id_flight = id_flight;
        this.num_adult = num_adult;
        this.num_child = num_child;
        this.bookingEntity = bookingEntity;
    }
}
