package app.domain;

import java.math.BigDecimal;
import java.util.Objects;

public class Vehicle {

    private Long id;
    private String carMake;
    private String carModel;
    private BigDecimal price;
    private String article;

    public Vehicle(Long id, String carMake, String carModel,BigDecimal price) {
        this.id = id;
        this.carMake = carMake;
        this.carModel= carModel;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public String getCarMake() {
        return carMake;
    }
    public String getCarModel() {
        return carMake;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return id.equals(vehicle.id) && carMake.equals(vehicle.carMake) && carModel.equals(vehicle.carModel) && price.equals(vehicle.price) && article.equals(vehicle.article);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, carMake, carModel, price, article);
    }

    @Override
    public String toString() {
        return String.format("Vehicle: id - %d, carMake - %s, carModel -%s, price - %s, article - %s",
                id, carMake, carModel, price, article);
    }
}
