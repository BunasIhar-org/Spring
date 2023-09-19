package web.dao;

import web.model.*;
import java.util.*;

public interface UserDao {

    void save(User user);

    void update(User user);

    User getOne(Long id);

    List<User> getAll();

    void deleteUser(Long id);

    List<User> search(String keyword);
}