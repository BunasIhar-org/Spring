package web.model;

import lombok.*;

@Data
@AllArgsConstructor
@ToString
public class Car {

    private String model;

    private int series;

    private int years;
}