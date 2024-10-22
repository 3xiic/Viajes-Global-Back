package co.edu.unbosque.viajes_global_back.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.json.bind.Jsonb;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name="hoteles")
@Getter
@Setter
public class HotelEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_hotel;
	private String name;
	private String address;
	private String city;
	private String country;
	private int night_price;
	private String images;
	private String description;
	private int assessment;
	private int stock;
	@JsonBackReference
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_hotel", referencedColumnName = "id_hotel", insertable = false, updatable = false)
	private PackageEntity packageEntity;



	public HotelEntity() {
		// TODO Auto-generated constructor stub
	}

	public HotelEntity(int id_hotel, String name, String address, String city, String country, int night_price, String images, String description, int assessment, int stock, PackageEntity packageEntity) {
		this.id_hotel = id_hotel;
		this.name = name;
		this.address = address;
		this.city = city;
		this.country = country;
		this.night_price = night_price;
		this.images = images;
		this.description = description;
		this.assessment = assessment;
		this.stock = stock;
		this.packageEntity = packageEntity;
	}
}
