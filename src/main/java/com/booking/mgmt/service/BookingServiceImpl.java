package com.booking.mgmt.service;

import com.booking.mgmt.mapper.BookingMapper;
import com.booking.mgmt.model.Booking;
import com.booking.mgmt.model.BookingRequest;
import com.booking.mgmt.model.BookingResponse;
import com.booking.mgmt.repository.BookingRepository;
import com.booking.mgmt.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class BookingServiceImpl implements BookingService {
    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    UserRepository userRepository;
    @Autowired
    BookingMapper bookingMapper;

    @Override
    public String bookAService(BookingRequest bookingRequest) {


        try {
            Booking booking = bookingMapper.mapBookingRequestToBooking(bookingRequest);
            bookingRepository.save(booking);
            return "Booking is successfully created";
        } catch (Exception e) {
            e.printStackTrace();
            return "Error in creating the booking";
        }

    }

    @Override
    public BookingResponse trackABooking(String bookingId) {
        return null;
    }

    @Override
    public String cancelABooking(String bookingId) {
        return null;
    }

    @Override
    public List<BookingResponse> listBookingsBy(String userId) {
        List<Booking> bookings = (List<Booking>) bookingRepository.
                findBybookedBy(userRepository.findById(Long.parseLong(userId)).get());
        if(bookings!=null && !bookings.isEmpty()){
            List<BookingResponse> bookingResponses = new ArrayList<>();
            for(Booking booking: bookings){
                bookingResponses.add(bookingMapper.mapBookingToBookingResponse(booking));
            }
            return bookingResponses;
        }
        return null;
    }
}
