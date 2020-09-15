package com.booking.mgmt.model;

import javax.persistence.*;

@Entity
@Table(name = "CITY")
public class City {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long cityId;
    @Column(name = "name")
    private String cityName;

    public long getCityId() {
        return cityId;
    }

    public void setCityId(long cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
}
