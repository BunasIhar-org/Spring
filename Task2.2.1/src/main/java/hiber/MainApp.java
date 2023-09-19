package hiber;

import hiber.config.*;
import hiber.model.*;
import hiber.service.*;
import org.springframework.context.annotation.*;
import java.util.*;

public class MainApp {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        UserService userService = context.getBean(UserService.class);

        userService.add(new User("User1", "Lastname1", "user1@mail.ru",
                new Car("Ferrari", 1)));
        userService.add(new User("User2", "Lastname2", "user2@mail.ru",
                new Car("Bugatti", 2)));
        userService.add(new User("User3", "Lastname3", "user3@mail.ru",
                new Car("Maserati", 3)));
        userService.add(new User("User4", "Lastname4", "user4@mail.ru",
                new Car("Aston Martin", 4)));

        List<User> users = userService.listUsers();
        for (User user : users) {
            System.out.println("Id = " + user.getId());
            System.out.println("First Name = " + user.getFirstName());
            System.out.println("Last Name = " + user.getLastName());
            System.out.println("Email = " + user.getEmail());
            System.out.println();
        }

        List<User> usersWithCar = userService.getUserByCar("Ferrari", 1);
        for (User user : usersWithCar) {
            System.out.println("Id = " + user.getId());
            System.out.println("First Name = " + user.getFirstName());
            System.out.println("Last Name = " + user.getLastName());
            System.out.println("Email = " + user.getEmail());
            System.out.println("Model of car = " + user.getCar().getModel());
            System.out.println("Model series = " + user.getCar().getSeries());
            System.out.println();
        }

        context.close();
    }
}