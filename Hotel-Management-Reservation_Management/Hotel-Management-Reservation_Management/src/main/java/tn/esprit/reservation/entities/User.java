package tn.esprit.reservation.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import tn.esprit.reservation.entities.UserRole ;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "`userHotel`")
@NoArgsConstructor
@Getter
@Setter
@ToString
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String email;
    @Enumerated(EnumType.STRING)
    private UserRole role;


}
