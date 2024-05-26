package app.repository;

import app.domain.Vehicle;

public interface VehicleRepository {

    Vehicle getById(Long id);
}
