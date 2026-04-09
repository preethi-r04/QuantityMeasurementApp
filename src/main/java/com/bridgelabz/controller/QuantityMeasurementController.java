package com.bridgelabz.controller;

import com.bridgelabz.entity.QuantityMeasurementEntity;
import com.bridgelabz.service.QuantityMeasurementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quantity")
public class QuantityMeasurementController {

    @Autowired
    private QuantityMeasurementService service;

    @PostMapping("/save")
    public String save(@RequestBody QuantityMeasurementEntity entity) {
        return service.addQuantity(entity);
    }

    @GetMapping("/all")
    public List<QuantityMeasurementEntity> getAll() {
        return service.getAll();
    }
}