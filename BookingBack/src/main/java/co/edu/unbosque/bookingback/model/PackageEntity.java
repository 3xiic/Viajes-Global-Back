package co.edu.unbosque.bookingback.model;

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
	}

	public PackageEntity(int id_package, int price, BookingEntity bookingEntity, Set<HotelEntity> hotelEntities, Set<FlightEntity> flightEntities, Set<ActivityEntity> activityEntities) {
		this.id_package = id_package;
		this.price = price;
		this.bookingEntity = bookingEntity;
		this.hotelEntities = hotelEntities;
		this.flightEntities = flightEntities;
		this.activityEntities = activityEntities;
	}
}

