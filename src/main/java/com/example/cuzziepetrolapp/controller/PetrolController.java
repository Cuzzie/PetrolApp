package com.example.cuzziepetrolapp.controller;

import com.example.cuzziepetrolapp.model.Petrol;
import com.example.cuzziepetrolapp.util.PetrolPriceScraper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Cuzzie on 6/8/2017.
 */
@RestController
public class PetrolController {

    @GetMapping("/")
    public List<Petrol> getPetrolPrice() {
        List<Petrol> petrolList = PetrolPriceScraper.scrapePetrolPrice();
        return petrolList;
    }

}
