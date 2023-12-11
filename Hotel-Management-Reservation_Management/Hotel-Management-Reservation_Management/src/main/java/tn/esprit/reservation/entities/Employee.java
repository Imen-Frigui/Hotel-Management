package tn.esprit.reservation.entities;


import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Employee implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    String firstName;
    String lastName;
    String email;
    String phoneNumber;
    @Temporal(TemporalType.DATE)
    Date hireDate;
    RoleType role;
    double salary;
    @OneToOne(mappedBy = "employee")
    @JsonBackReference
    private Event event;
}
