package web.service;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import web.dao.*;
import web.model.*;
import javax.transaction.*;
import java.util.*;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    private final UserDao userDao;

    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void save(User user) {
        userDao.save(user);
    }

    @Override
    public void update(User user) {
        userDao.update(user);
    }

    @Override
    public User getOne(Long id) {
        return userDao.getOne(id);
    }

    @Override
    public List<User> getAll() {
        return userDao.getAll();
    }

    @Override
    public void deleteUser(Long id) {
        userDao.deleteUser(id);
    }

    @Override
    public List<User> search(String keyword) {
        return userDao.search(keyword);
    }
}