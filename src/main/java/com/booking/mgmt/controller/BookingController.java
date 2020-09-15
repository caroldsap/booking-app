package com.booking.mgmt.controller;

import com.booking.mgmt.model.BookingRequest;
import com.booking.mgmt.model.BookingResponse;
import com.booking.mgmt.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping("/v1/booking")
public class BookingController {
    @Autowired
    BookingService bookingService;

    @PostMapping("/book")
    private String bookAService(@RequestBody BookingRequest bookingRequest){
        return bookingService.bookAService(bookingRequest);
    }

    @GetMapping("/list")
    private List<BookingResponse> listBookings(String userId){
        return bookingService.listBookingsBy(userId);
    }
}

