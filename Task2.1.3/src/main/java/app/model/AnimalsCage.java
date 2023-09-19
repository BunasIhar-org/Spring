package app.model;

import lombok.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

@Component
@Data
public class AnimalsCage {

    private final Animal animal;

    private final Timer timer;

    @Autowired
    public AnimalsCage(@Qualifier("dog") Animal animal, Timer timer) {
        this.animal = animal;
        this.timer = timer;
    }

    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animal.toString());
        System.out.println("At:");
        System.out.println(timer.getTime());
        System.out.println("________________________");
    }
}