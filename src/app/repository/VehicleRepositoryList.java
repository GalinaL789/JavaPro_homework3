package app.repository;

import app.domain.Vehicle;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Repository
public class VehicleRepositoryList implements VehicleRepository {

    private final List<Vehicle> database = new ArrayList<>();

    public VehicleRepositoryList() {
       database.add(new Vehicle(1L, "Seat", "Leon", new BigDecimal(14000)));
       database.add(new Vehicle(2L, "Toyota", "Corolla", new BigDecimal(10000)));
       database.add(new Vehicle(3L, "Mercedes", "Elegance", new BigDecimal(25000)));
    }



    @Override
    public Vehicle getById(Long id) {
        if (database.isEmpty()) {
            System.out.println("database is empty");
            return null;
        }

        for (Vehicle vehicle: database )
        {
            if(vehicle.getId()==id)  {
                System.out.println("the car with id: "+ id +" is found");
                return vehicle;
            }
        }
        System.out.println("the car with id: "+ id +" is not found");
        return null;
    }


}