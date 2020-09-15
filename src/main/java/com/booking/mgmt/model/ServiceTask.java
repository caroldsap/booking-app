package com.booking.mgmt.model;

import javax.persistence.*;
import java.util.List;
@Entity
@Table(name = "SERVICE")
public class ServiceTask {
    @Id
    @Column(name="ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="SERVICE_NAME")
    private String serviceName;
    @Column(name="SERVICE_TYPE")
    private ServiceType serviceType;

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public ServiceType getServiceType() {
        return serviceType;
    }

    public void setServiceType(ServiceType serviceType) {
        this.serviceType = serviceType;
    }


}
