package com.booking.mgmt.model;

import java.util.Date;

public class BookingRequest {

    private String cityId;
    private String userId;
    private String serviceId;
    /**
     * DateTime in epochseconds
     */
    private long bookingDateTime;
    private String packageId;
    boolean isPackage;
    private Date serviceRequestedDateTime;

    private int paymentType;

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public long getBookingDateTime() {
        return bookingDateTime;
    }

    public void setBookingDateTime(long bookingDateTime) {
        this.bookingDateTime = bookingDateTime;
    }

    public String getPackageId() {
        return packageId;
    }

    public void setPackageId(String packageId) {
        this.packageId = packageId;
    }

    public boolean isPackage() {
        return isPackage;
    }

    public void setPackage(boolean aPackage) {
        isPackage = aPackage;
    }

    public Date getServiceRequestedDateTime() {
        return serviceRequestedDateTime;
    }

    public void setServiceRequestedDateTime(Date serviceRequestedDateTime) {
        this.serviceRequestedDateTime = serviceRequestedDateTime;
    }



    public int getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(int paymentType) {
        this.paymentType = paymentType;
    }
}
