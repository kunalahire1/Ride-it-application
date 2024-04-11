package com.example.rideit.model;

import com.example.rideit.Enum.TripStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class TripBooking {
    @Id
            @GeneratedValue(strategy = GenerationType.UUID)
    int id;
    int source;
    int destination;
    double tripDistanceInKm;
    double totalFair;
    TripStatus tripStatus;
    @CreationTimestamp
    Date bookedAt;
}
