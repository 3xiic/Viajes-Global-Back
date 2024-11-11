package co.edu.unbosque.bookingback.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;
@Getter
@Setter


public class BookingDTO {

    private int id_booking;
    private int id_client;
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
        // TODO Auto-generated constructor stub
    }

    public BookingDTO(int id_booking, int id_client,  Date booking_date, String booking_status, String name, String email, String telephone, PackageEntity packageEntity, BookingDetailEntity bookingDetailEntity) {
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

    public BookingDTO(BookingDTO bookingDTO) {
    }
}