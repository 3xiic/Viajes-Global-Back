package co.edu.unbosque.viajes_global_back.model;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
public class PackageDTO {

    private int id_package;
    private int id_hotel;
    private int id_flight;
    private int id_activity;
    private int price;
    @JsonBackReference
    private BookingEntity bookingEntity;
    @JsonManagedReference
    private Set<HotelEntity> hotelEntities;
    @JsonManagedReference
    private Set<FlightEntity> flightEntities;
    @JsonManagedReference
    private Set<ActivityEntity>activityEntities;

    public PackageDTO() {
        // TODO Auto-generated constructor stub
    }

    public PackageDTO(int id_package, int id_hotel, int id_flight, int id_activity, int price, BookingEntity bookingEntity, Set<HotelEntity> hotelEntities, Set<FlightEntity> flightEntities, Set<ActivityEntity> activityEntities) {
        this.id_package = id_package;
        this.id_hotel = id_hotel;
        this.id_flight = id_flight;
        this.id_activity = id_activity;
        this.price = price;
        this.bookingEntity = bookingEntity;
        this.hotelEntities = hotelEntities;
        this.flightEntities = flightEntities;
        this.activityEntities = activityEntities;
    }
}
