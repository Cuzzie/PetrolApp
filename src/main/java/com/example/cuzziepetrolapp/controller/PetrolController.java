package com.example.cuzziepetrolapp.controller;

import com.example.cuzziepetrolapp.model.Petrol;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * Created by Cuzzie on 6/8/2017.
 */
@RestController
public class PetrolController {

    @GetMapping("/")
    public Petrol getPetrolPrice() {
        Petrol petrol = new Petrol("Ron 95", new BigDecimal("2.05"), "-0.05 compare previous week");
        return petrol;
    }

}
