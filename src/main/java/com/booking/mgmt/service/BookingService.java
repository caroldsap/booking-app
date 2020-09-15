package com.booking.mgmt.service;

import com.booking.mgmt.model.BookingRequest;
import com.booking.mgmt.model.BookingResponse;

import java.util.List;

public interface BookingService {

    public String bookAService(BookingRequest bookingRequest);
    public BookingResponse trackABooking(String bookingId);
    public String cancelABooking(String bookingId);
    public List<BookingResponse> listBookingsBy(String userId);
}
