package hiber.dao;

import hiber.model.*;
import org.hibernate.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import javax.persistence.*;
import java.util.*;

@Repository
public class UserDaoImp implements UserDao {

    private final SessionFactory sessionFactory;

   @Autowired
   public UserDaoImp(SessionFactory sessionFactory) {
       this.sessionFactory = sessionFactory;
   }

   @Override
   public void add(User user) {
      sessionFactory.getCurrentSession().save(user);
   }

   @Override
   public List<User> listUsers() {
       String hql = "from User";
       TypedQuery<User> query = sessionFactory.getCurrentSession().createQuery(hql, User.class);
       return query.getResultList();
   }

    @Override
    public List<User> getUserByCar(String model, int series) {
        String hql = "FROM User WHERE car.model = :model AND car.series = :series";
        try (Session session = sessionFactory.openSession()) {
            TypedQuery<User> query = session.createQuery(hql, User.class);
            query.setParameter("model", model);
            query.setParameter("series", series);
            return query.getResultList();
        }
    }
}