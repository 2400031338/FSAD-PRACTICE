package com.klu.controller;

import com.klu.model.PropertyResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/property")
public class PropertyController {

    @GetMapping("/evaluate")
    public PropertyResponse evaluateProperty(
            @RequestParam String location,
            @RequestParam int rooms,
            @RequestParam int age) {

        String suggestion = "";

        if (age > 10) {
            suggestion += "Renovation recommended. ";
        }

        if (rooms < 2) {
            suggestion += "Consider adding extra room. ";
        }

        if (location.equalsIgnoreCase("urban")) {
            suggestion += "Smart home features can increase value.";
        }

        return new PropertyResponse(location, rooms, age, suggestion);
    }
}
