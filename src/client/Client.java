package client;

import app.controller.VehicleController;
import app.domain.Vehicle;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Client {

    public static void main(String[] args) {

        AbstractApplicationContext context = new AnnotationConfigApplicationContext("app");
        VehicleController controller = context.getBean(VehicleController.class);
        Vehicle vehicle = controller.getById(3L);
        System.out.println(vehicle);
    }
}