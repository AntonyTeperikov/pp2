package web.model;

import org.springframework.stereotype.Component;

import java.util.Objects;

public class Car {
    private int id;
    private String model;
    private String classCar;


    public Car(int id, String model, String classCar) {
        this.id = id;
        this.model = model;
        this.classCar = classCar;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getClassCar() {
        return classCar;
    }

    public void setClassCar(String classCar) {
        this.classCar = classCar;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", classCar='" + classCar + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return model.equals(car.model) && classCar.equals(car.classCar);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, classCar);
    }
}
