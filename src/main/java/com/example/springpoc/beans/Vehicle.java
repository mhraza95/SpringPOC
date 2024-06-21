package com.example.springpoc.beans;

import com.example.springpoc.services.VehicleServices;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("vehicleBean")
public class Vehicle {

    public String name = "Honda";

    private final VehicleServices vehicleServices;

    @Autowired
    public Vehicle(VehicleServices vehicleServices) {
        this.vehicleServices = vehicleServices;
    }

    public VehicleServices getVehicleServices() {
        return vehicleServices;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Vehicle name is - " + name;
    }

    /*@PostConstruct
    public void initialize() {

        this.name = "Honda";
    }
    @PreDestroy
    public void destroy() {
        System.out.println(
                "Destroying Vehicle Bean");
    }*/
}
