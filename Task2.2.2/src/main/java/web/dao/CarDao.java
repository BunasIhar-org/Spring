package web.dao;

import web.model.*;
import java.util.*;

public interface CarDao {

    List<Car> cars(Integer count);
}