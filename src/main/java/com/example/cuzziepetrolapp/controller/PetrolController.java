package com.example.cuzziepetrolapp.controller;

import com.example.cuzziepetrolapp.model.Petrol;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Cuzzie on 6/8/2017.
 */
@RestController
public class PetrolController {

    @GetMapping("/")
    public List<Petrol> getPetrolPrice() {
        List<Petrol> petrolList = new ArrayList<>();
        petrolList.add(new Petrol("Ron 95", new BigDecimal("2.05"), "-0.05 compare previous week"));
        petrolList.add(new Petrol("Ron 97", new BigDecimal("2.15"), "blablabla"));
        return petrolList;
    }

}
