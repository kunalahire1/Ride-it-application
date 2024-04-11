package com.example.rideit.model;

import com.example.rideit.Enum.CarType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)

public class Cab {
    @Id
    int id;
    String company;
    String carModel;
    @Enumerated(EnumType.STRING)
    CarType carType;

    int numberOfSeats;
    double farePerKm;
    Driver driver;

}
