package co.edu.unbosque.bookingback.service;

import co.edu.unbosque.bookingback.model.*;

public class DataMapper {



    public static ActivityEntity activityDTOtoEntity(ActivityDTO dto) {
        return new ActivityEntity(
                dto.getId_activity(),
                dto.getName(),
                dto.getDescription(),
                dto.getPrice(),
                dto.getLocation(),
                dto.getCategory(),
                dto.getImages(),
                dto.getAssessment(),
                dto.getStock(),
                dto.getPackageEntity()
        );
    }

    public static ActivityDTO activityEntityToDTO(ActivityEntity entity) {
        return new ActivityDTO(
                entity.getId_activity(),
                entity.getName(),
                entity.getDescription(),
                entity.getPrice(),
                entity.getLocation(),
                entity.getCategory(),
                entity.getImages(),
                entity.getAssessment(),
                entity.getStock(),
                entity.getPackageEntity()
        );
    }

    public static BookingDetailDTO bookingDetailEntityToDTO(BookingDetailEntity entity) {
        return new BookingDetailDTO(
                entity.getId_booking_detail(),
                entity.getId_booking(),
                entity.getId_flight(),
                entity.getNum_adult(),
                entity.getNum_child(),
                entity.getBookingEntity()
        );
    }

    public static BookingDetailEntity bookingDetailDTOtoEntity(BookingDetailDTO dto) {
        return new BookingDetailEntity(
                dto.getId_booking_detail(),
                dto.getId_booking(),
                dto.getId_flight(),
                dto.getNum_adult(),
                dto.getNum_child(),
                dto.getBookingEntity()
        );
    }

    public static BookingDTO bookingEntityToDTO(BookingEntity entity) {
        return new BookingDTO(
                entity.getId_booking(),
                entity.getId_client(),
                entity.getBooking_date(),
                entity.getBooking_status(),
                entity.getName(),
                entity.getEmail(),
                entity.getTelephone(),
                entity.getPackageEntity(),
                entity.getBookingDetailEntity()
        );
    }

    public static BookingEntity bookingDTOtoEntity(BookingDTO dto) {
        return new BookingEntity(
                dto.getId_booking(),
                dto.getId_client(),
                dto.getBooking_date(),
                dto.getBooking_status(),
                dto.getName(),
                dto.getEmail(),
                dto.getTelephone(),
                dto.getPackageEntity(),
                dto.getBookingDetailEntity()
        );
    }

    public static FlightDTO flightEntityToDTO(FlightEntity entity) {
        return new FlightDTO(
                entity.getId_flight(),
                entity.getAirline(),
                entity.getOrigin(),
                entity.getDestination(),
                entity.getDeparture_date(),
                entity.getArrival_date(),
                entity.getPrice(),
                entity.getImages(),
                entity.getDescription(),
                entity.getAssessment(),
                entity.getStock(),
                entity.getPackageEntity()
        );
    }

    public static FlightEntity flightDTOtoEntity(FlightDTO dto) {
        return new FlightEntity(
                dto.getId_flight(),
                dto.getAirline(),
                dto.getOrigin(),
                dto.getDestination(),
                dto.getDeparture_date(),
                dto.getArrival_date(),
                dto.getPrice(),
                dto.getImages(),
                dto.getDescription(),
                dto.getAssessment(),
                dto.getStock(),
                dto.getPackageEntity()
        );
    }

    public static HotelDTO hotelEntityToDTO(HotelEntity entity) {
        return new HotelDTO(
                entity.getId_hotel(),
                entity.getName(),
                entity.getAddress(),
                entity.getCity(),
                entity.getCountry(),
                entity.getNight_price(),
                entity.getImages(),
                entity.getDescription(),
                entity.getAssessment(),
                entity.getStock(),
                entity.getPackageEntity()
        );
    }

    public static HotelEntity hotelDTOtoEntity(HotelDTO dto) {
        return new HotelEntity(
                dto.getId_hotel(),
                dto.getName(),
                dto.getAddress(),
                dto.getCity(),
                dto.getCountry(),
                dto.getNight_price(),
                dto.getImages(),
                dto.getDescription(),
                dto.getAssessment(),
                dto.getStock(),
                dto.getPackageEntity()
        );
    }

    public static PackageDTO packageEntityToDTO(PackageEntity entity) {
        return new PackageDTO(
                entity.getId_package(),
                entity.getPrice(),
                entity.getBookingEntity(),
                entity.getHotelEntities(),
                entity.getFlightEntities(),
                entity.getActivityEntities()
        );
    }

    public static PackageEntity packageDTOToEntity(PackageDTO dto) {
        return new PackageEntity(
                dto.getId_package(),
                dto.getPrice(),
                dto.getBookingEntity(),
                dto.getHotelEntities(),
                dto.getFlightEntities(),
                dto.getActivityEntities()
        );
    }

    public DataMapper() {
        throw new IllegalStateException("Utility class");
    }
}
