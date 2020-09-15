package com.booking.mgmt.service;

import com.booking.mgmt.model.ServiceTask;

import java.util.List;

public interface ListingService {

    public List<ServiceTask> getServicesByCity(String cityName);
    public String addService(ServiceTask serviceTask, String cityName);
}
