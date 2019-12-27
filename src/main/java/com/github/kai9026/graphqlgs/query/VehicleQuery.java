package com.github.kai9026.graphqlgs.query;

import java.util.List;
import java.util.Optional;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.github.kai9026.graphqlgs.entity.Vehicle;
import com.github.kai9026.graphqlgs.service.VehicleService;

import org.springframework.stereotype.Component;

@Component
public class VehicleQuery implements GraphQLQueryResolver {

    private VehicleService vehicleService;

    public VehicleQuery(final VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

    public List<Vehicle> getVehicles(final int count) {
        return this.vehicleService.getAllVehicles(count);
    }

    public Optional<Vehicle> getVehicle(final int id) {
        return this.vehicleService.getVehicle(id);
    }

}