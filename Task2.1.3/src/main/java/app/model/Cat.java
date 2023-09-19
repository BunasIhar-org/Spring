package app.model;

import org.springframework.stereotype.*;

@Component(value = "cat")
public class Cat extends Animal {
    @Override
    public String toString() {
        return "Im a Cat";
    }
}