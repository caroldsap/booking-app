package com.booking.mgmt.model;

import java.util.Date;

public class BookingResponse {

    String bookingId;
    BookingStatus bookingStatus;
    User assignedTo;
    Date bookedTime;
    Date serviceRequestedTime;
    String serviceRequestedFor;

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public BookingStatus getBookingStatus() {
        return bookingStatus;
    }

    public void setBookingStatus(BookingStatus bookingStatus) {
        this.bookingStatus = bookingStatus;
    }

    public User getAssignedTo() {
        return assignedTo;
    }

    public void setAssignedTo(User assignedTo) {
        this.assignedTo = assignedTo;
    }

    public Date getBookedTime() {
        return bookedTime;
    }

    public void setBookedTime(Date bookedTime) {
        this.bookedTime = bookedTime;
    }

    public Date getServiceRequestedTime() {
        return serviceRequestedTime;
    }

    public void setServiceRequestedTime(Date serviceRequestedTime) {
        this.serviceRequestedTime = serviceRequestedTime;
    }

    public String getServiceRequestedFor() {
        return serviceRequestedFor;
    }

    public void setServiceRequestedFor(String serviceRequestedFor) {
        this.serviceRequestedFor = serviceRequestedFor;
    }
}
