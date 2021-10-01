package com.conti.vtrack.service.resources;

import java.util.Optional;

import com.conti.vtrack.service.app.models.Vehicle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Component
@RestController
@RequestMapping("/vehicles")
public class VehicleResource {

    @Autowired
    private com.conti.vtrack.service.app.repositories.VehicleRepository vehicleRepository;

    @PostMapping
    public com.conti.vtrack.service.app.models.Vehicle create(@RequestBody Vehicle vehicle) {
        
        return vehicleRepository.save(vehicle);
    }

    @GetMapping(value = "/{vehicleId}")
    public Optional<Vehicle> get(@PathVariable String vehicleId) {

        return vehicleRepository.findById(vehicleId);
    }
}