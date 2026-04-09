package com.bridgelabz.service;

import com.bridgelabz.dto.QuantityDTO;
import com.bridgelabz.entity.QuantityMeasurementEntity;
import com.bridgelabz.model.LengthUnit;
import com.bridgelabz.model.Quantity;
import com.bridgelabz.repository.IQuantityMeasurementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import com.bridgelabz.entity.QuantityMeasurementEntity;
import com.bridgelabz.repository.QuantityMeasurementDatabaseRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuantityMeasurementServiceImpl implements QuantityMeasurementService {

    private final QuantityMeasurementDatabaseRepository repository =
            new QuantityMeasurementDatabaseRepository();

    @Override
    public String addQuantity(QuantityMeasurementEntity entity) {
        repository.save(entity);
        return "Saved to DB";
    }

    @Override
    public List<QuantityMeasurementEntity> getAll() {
        return repository.findAll();
    }
}