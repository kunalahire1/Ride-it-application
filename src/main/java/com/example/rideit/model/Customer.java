package com.example.rideit.model;

import com.example.rideit.Enum.Gender;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "customer")
public class Customer {
    @Id
    int id;
    String name;
    int age;
    String emailId;
    String address;
    @Enumerated(EnumType.STRING)
    Gender gender;
}
