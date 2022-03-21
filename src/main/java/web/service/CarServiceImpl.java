package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.dao.CarDAOImpl;
import web.model.Car;

import java.util.List;
@Component
public class CarServiceImpl implements CarService {
    @Autowired
    CarDAOImpl carDAO = new CarDAOImpl();
    @Override
    public List<Car> allСars() {
        return carDAO.allСars();
    }

    @Override
    public List<Car> limitCar(int count) {
        return carDAO.limitCar(count);
    }
}
