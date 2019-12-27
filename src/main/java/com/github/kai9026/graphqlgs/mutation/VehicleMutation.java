package com.github.kai9026.graphqlgs.mutation;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.github.kai9026.graphqlgs.entity.Vehicle;
import com.github.kai9026.graphqlgs.service.VehicleService;

import org.springframework.stereotype.Component;

@Component
public class VehicleMutation implements GraphQLMutationResolver {

    private VehicleService vehicleService;

    public VehicleMutation(final VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

    public Vehicle createVehicle(final String type, final String modelCode, final String brandName,
            final String launchDate) {
        return this.vehicleService.createVehicle(type, modelCode, brandName, launchDate);
    }
}