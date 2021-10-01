package com.conti.vtrack.service.app.repositories;

import com.conti.vtrack.service.app.models.Vehicle;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface VehicleRepository extends MongoRepository<Vehicle, String> {   
}