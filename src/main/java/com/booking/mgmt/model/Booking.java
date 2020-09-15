package com.booking.mgmt.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="BOOKING")
public class Booking {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToOne(cascade=CascadeType.ALL, fetch = FetchType.EAGER)
    private City city;

    @OneToOne(cascade=CascadeType.ALL, fetch = FetchType.EAGER)
    private User bookedBy;

    @OneToOne(cascade=CascadeType.ALL, fetch = FetchType.EAGER)
    private ServiceTask serviceTask;
    private Date lastModifiedDateTime;
    private Date serviceBookedDateTime;
    private PaymentType paymentType;
    private PaymentStatus paymentStatus;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public User getBookedBy() {
        return bookedBy;
    }

    public void setBookedBy(User bookedBy) {
        this.bookedBy = bookedBy;
    }

    public ServiceTask getServiceTask() {
        return serviceTask;
    }

    public void setServiceTask(ServiceTask serviceTask) {
        this.serviceTask = serviceTask;
    }

    public Date getLastModifiedDateTime() {
        return lastModifiedDateTime;
    }

    public void setLastModifiedDateTime(Date lastModifiedDateTime) {
        this.lastModifiedDateTime = lastModifiedDateTime;
    }

    public Date getServiceBookedDateTime() {
        return serviceBookedDateTime;
    }

    public void setServiceBookedDateTime(Date serviceBookedDateTime) {
        this.serviceBookedDateTime = serviceBookedDateTime;
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }
}
