package co.edu.unbosque.viajes_global_back.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;
@Getter
@Setter


public class BookingDTO {

    private int id_booking;
    @JsonBackReference
    private ClientEntity clientEntity;
    private Date booking_date;
    private String booking_status;
    private String name;
    private String email;
    private String telephone;
    @JsonManagedReference
    private PackageEntity packageEntity;
    @JsonManagedReference
    private BookingDetailEntity bookingDetailEntity;

    public BookingDTO() {
    }

    public BookingDTO(int id_booking, ClientEntity clientEntity, Date booking_date, String booking_status, String name, String email, String telephone, PackageEntity packageEntity, BookingDetailEntity bookingDetailEntity) {
        this.id_booking = id_booking;
        this.clientEntity = clientEntity;
        this.booking_date = booking_date;
        this.booking_status = booking_status;
        this.name = name;
        this.email = email;
        this.telephone = telephone;
        this.packageEntity = packageEntity;
        this.bookingDetailEntity = bookingDetailEntity;
    }
}