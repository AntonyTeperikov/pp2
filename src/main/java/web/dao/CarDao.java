package web.dao;

import web.model.Car;

import java.util.List;

public interface CarDao {
    List<Car> allСars();
    List<Car> limitCar(int count);
}
