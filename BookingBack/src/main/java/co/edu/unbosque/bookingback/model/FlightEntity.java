package co.edu.unbosque.bookingback.model;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "vuelos")
@Getter
@Setter
public class FlightEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_flight;
    private String airline;
    private String origin;
    private String destination;
    private Date departure_date;
    private Date arrival_date;
    private int price;
    private String images;
    private String description;
    private int assessment;
    private int stock;
    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_package")
    private PackageEntity packageEntity;

    public FlightEntity() {

    }

    public FlightEntity(int id_flight, String airline, String origin, String destination, Date departure_date, Date arrival_date, int price, String images, String description, int assessment, int stock, PackageEntity packageEntity) {
        this.id_flight = id_flight;
        this.airline = airline;
        this.origin = origin;
        this.destination = destination;
        this.departure_date = departure_date;
        this.arrival_date = arrival_date;
        this.price = price;
        this.images = images;
        this.description = description;
        this.assessment = assessment;
        this.stock = stock;
        this.packageEntity = packageEntity;
    }
}
