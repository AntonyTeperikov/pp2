package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarDAOImpl implements CarDao {
    private static int CAR_COUNT;
    private List<Car> auto;{
        auto = new ArrayList<>();
        auto.add(new Car(++CAR_COUNT,"BMV","S"));
        auto.add(new Car(++CAR_COUNT,"LADA","B"));
        auto.add(new Car(++CAR_COUNT,"LAMBO","S"));
        auto.add(new Car(++CAR_COUNT,"MERS","S"));
        auto.add(new Car(++CAR_COUNT,"RENAULT","C"));
    }

    @Override
    public List<Car> allСars() {
        return auto;
    }
    public List<Car> limitCar(int count){
        return  auto.stream().limit(count).collect(Collectors.toList());
    }
}
