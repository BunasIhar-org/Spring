package hiber.service;

import hiber.model.*;
import java.util.*;

public interface UserService {

    void add(User user);

    List<User> listUsers();

    List<User> getUserByCar(String model, int series);
}