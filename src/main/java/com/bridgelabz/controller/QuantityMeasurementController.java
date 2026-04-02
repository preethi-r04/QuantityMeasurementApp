package com.bridgelabz.controller;

import com.bridgelabz.dto.QuantityDTO;
import com.bridgelabz.service.QuantityMeasurementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/quantity")
public class QuantityMeasurementController {

    @Autowired
    private QuantityMeasurementService service;

    @PostMapping("/add")
    public QuantityDTO add(@RequestBody QuantityDTO[] quantities) {
        return service.add(quantities[0], quantities[1]);
    }

    @PostMapping("/compare")
    public boolean compare(@RequestBody QuantityDTO[] quantities) {
        return service.compare(quantities[0], quantities[1]);
    }
}