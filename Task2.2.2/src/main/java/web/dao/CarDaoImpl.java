package web.dao;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import web.model.*;
import javax.annotation.*;
import java.util.*;
import java.util.stream.*;

@Repository
public class CarDaoImpl implements CarDao {

    private final List<Car> cars;

    @Autowired
    public CarDaoImpl(List<Car> cars) {
        this.cars = cars;
    }

    @PostConstruct
    public void init() {
        cars.add(new Car("Ferrari", 1, 1990));
        cars.add(new Car("Maserati", 2, 2000));
        cars.add(new Car("Lamborghini", 3, 2010));
        cars.add(new Car("Bugatti", 4, 2020));
        cars.add(new Car("Aston Martin", 5, 1980));
    }

    @Override
    public List<Car> cars(Integer count) {
        if (count == null || count <= 0 || count >= 5) {
            return cars;
        } else {
            return cars.stream().limit(count).collect(Collectors.toList());
        }
    }
}