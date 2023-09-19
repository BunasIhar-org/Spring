package hiber.dao;

import hiber.model.*;
import java.util.*;

public interface UserDao {

    void add(User user);

    List<User> listUsers();

    List<User> getUserByCar(String model, int series);

}