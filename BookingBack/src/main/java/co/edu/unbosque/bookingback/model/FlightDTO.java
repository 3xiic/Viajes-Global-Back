package co.edu.unbosque.bookingback.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter

public class FlightDTO {

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
    private PackageEntity packageEntity;

    public FlightDTO() {
        // TODO Auto-generated constructor stub
    }

    public FlightDTO(int id_flight, String airline, String origin, String destination, Date departure_date, Date arrival_date, int price, String images, String description, int assessment, int stock, PackageEntity packageEntity) {
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
