package com.example.springpoc.implementation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SonySpeakers {

    public String makeSound() {
        return "Sony Speakers making sound";
    }
}
