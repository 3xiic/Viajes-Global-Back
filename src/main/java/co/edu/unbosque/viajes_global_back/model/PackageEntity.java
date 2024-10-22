package co.edu.unbosque.viajes_global_back.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Table(name="paquetes_turisticos")
@Getter
@Setter
public class PackageEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_package;
	private int id_hotel;
	private int id_flight;
	private int id_activity;
	private int price;
	@JsonBackReference
	@OneToOne(mappedBy = "packageEntity")
	private BookingEntity bookingEntity;
	@JsonManagedReference
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "packageEntity", cascade = CascadeType.ALL)
	private Set<HotelEntity> hotelEntities;
	@JsonManagedReference
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "packageEntity", cascade = CascadeType.ALL)
	private Set<FlightEntity> flightEntities;
	@JsonManagedReference
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "packageEntity", cascade = CascadeType.ALL)
	private Set<ActivityEntity> activityEntities;


	public PackageEntity() {
		// TODO Auto-generated constructor stub
	}

	public PackageEntity(int id_package, int id_hotel, int id_flight, int id_activity, int price, BookingEntity bookingEntity, Set<HotelEntity> hotelEntities, Set<FlightEntity> flightEntities, Set<ActivityEntity> activityEntities) {
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

