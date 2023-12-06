package esprit.tn.events.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

@Entity
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
    private UserRole userRole;

}
