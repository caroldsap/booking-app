package com.booking.mgmt.service;

public enum RatingType {
    VERY_BAD("Very Bad"),
    BAD("Bad"),
    AVERAGE("Average"),
    GOOD("Good"),
    EXELLENT("Excellent");

    private  String ratingValue;

    RatingType(String ratingValue) {
        this.ratingValue = ratingValue;


    }
}
