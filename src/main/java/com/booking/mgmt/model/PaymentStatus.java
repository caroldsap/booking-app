package com.booking.mgmt.model;

public enum PaymentStatus {
    PENDING("Pending"),
    SUCCESS("Success"),
    FAILURE("Failure");
    private String statusReason;

    PaymentStatus(String statusReason) {
        this.statusReason = statusReason;
    }
}
