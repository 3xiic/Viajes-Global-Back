package co.edu.unbosque.bookingback.model;


import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class HotelDTO {


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
    private PackageEntity packageEntity;

    public HotelDTO() {
        // TODO Auto-generated constructor stub
    }

    public HotelDTO(int id_hotel, String name, String address, String city, String country, int night_price, String images, String description, int assessment, int stock, PackageEntity packageEntity) {
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
