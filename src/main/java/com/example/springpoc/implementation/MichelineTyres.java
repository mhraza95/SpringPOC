package com.example.springpoc.implementation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MichelineTyres {

    public String rotate() {
        return "Micheline Tyres rotating";
    }
}
