package web.service;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import web.dao.*;
import web.model.*;
import java.util.*;

@Service
public class CarServiceImpl implements CarService {

    private final CarDao carDao;

    @Autowired
    public CarServiceImpl(CarDao carDao) {
        this.carDao = carDao;
    }

    @Override
    public List<Car> cars(Integer count) {
        return carDao.cars(count);
    }
}