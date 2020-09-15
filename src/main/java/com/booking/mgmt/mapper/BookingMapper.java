package com.booking.mgmt.mapper;

import com.booking.mgmt.model.*;
import com.booking.mgmt.repository.CityRepository;
import com.booking.mgmt.repository.ServiceTaskRepository;
import com.booking.mgmt.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.Optional;

@Component
public class BookingMapper {
    @Autowired
    UserRepository userRepository;
    @Autowired
    ServiceTaskRepository serviceTaskRepository;
    @Autowired
    CityRepository cityRepository;

    public Booking mapBookingRequestToBooking(BookingRequest bookingRequest){
        Booking booking = new Booking();
        booking.setBookedBy(userRepository.findById(Long.parseLong(bookingRequest.getUserId())).get());
        booking.setServiceTask(serviceTaskRepository.findById(Long.parseLong(bookingRequest.getServiceId())).get());
        booking.setLastModifiedDateTime(new Date());
        booking.setServiceBookedDateTime(bookingRequest.getServiceRequestedDateTime());
        booking.setCity(cityRepository.findById(Long.parseLong(bookingRequest.getCityId())).get());
        booking.setPaymentStatus(PaymentStatus.PENDING);
        booking.setPaymentType(PaymentType.byPaymentType(
                bookingRequest.getPaymentType()));
        return booking;
    }

    public BookingResponse mapBookingToBookingResponse(Booking booking){
        BookingResponse bookingResponse = new BookingResponse();

        bookingResponse.setBookingId(booking.getId()+"");
        bookingResponse.setBookedTime(booking.getLastModifiedDateTime());
        bookingResponse.setServiceRequestedTime(booking.getServiceBookedDateTime());
        bookingResponse.setBookingStatus(BookingStatus.OPEN);
        bookingResponse.setServiceRequestedFor(booking.getServiceTask().getServiceName());
        return bookingResponse;
    }
}
