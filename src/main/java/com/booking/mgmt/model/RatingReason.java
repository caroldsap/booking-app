package com.booking.mgmt.model;

public enum RatingReason {
    NOT_CLEAN("Not Clean"),
    ARRIVED_LATE("Late Arrival"),
    NEAT("Neat Job"),
    PROFESSIONAL("Knows the Job and does very well"),
    OTHER("Other Reasons");
    private String ratingReason;

    RatingReason(String ratingReason) {
        this.ratingReason = ratingReason;
    }
}
