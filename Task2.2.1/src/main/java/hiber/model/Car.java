package hiber.model;

import lombok.*;
import javax.persistence.*;

@Entity
@Table(name = "car")
@NoArgsConstructor
@Getter
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String model;

    private int series;

    @OneToOne(mappedBy = "car")
    private User user;

    public Car(String model, int series) {
        this.model = model;
        this.series = series;
    }
}