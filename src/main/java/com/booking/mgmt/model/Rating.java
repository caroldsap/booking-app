package com.booking.mgmt.model;

import com.booking.mgmt.service.RatingType;

public class Rating {
    private long id;
    private long bookingId;
    private long userId;
    private RatingType ratingType;
    private RatingReason ratingReason;
    private String otherReason;
}
