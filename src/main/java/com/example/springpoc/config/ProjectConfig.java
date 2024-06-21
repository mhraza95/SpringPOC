package com.example.springpoc.config;

import com.example.springpoc.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = {"com.example.springpoc.implementation",
        "com.example.springpoc.beans"})
@ComponentScan(basePackageClasses = {com.example.springpoc.beans.Vehicle.class,
        com.example.springpoc.beans.Person.class})
public class ProjectConfig {

    /*@Bean(name = "vehicle1")
    Vehicle vehicle1() {
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Audie 8");
        return vehicle;
    }

    @Bean(name = "vehicle2")
    Vehicle vehicle2() {
        Vehicle vehicle = new Vehicle();
        vehicle.setName("BMW 5");
        return vehicle;
    }
    @Bean(name = "vehicle3")
    Vehicle vehicle3() {
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Mercedes 3");
        return vehicle;
    }*/

    /*@Bean
    String hello() {
        return "Hello";
    }

    @Bean
    Integer number() {
        return 100;
    }*/
}
