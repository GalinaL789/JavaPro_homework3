package app.controller;

import app.domain.Vehicle;
import app.service.VehicleService;
import app.service.VehicleService;
import org.springframework.stereotype.Component;

@Component
public class VehicleController {

    private VehicleService service;

    public VehicleController(VehicleService service) {
        this.service = service;
    }

    public Vehicle getById(Long id) {
        return service.getById(id);
    }
}