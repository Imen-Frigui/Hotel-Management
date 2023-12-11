package tn.esprit.reservation.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.Date;
import java.util.List;


@Entity
@NoArgsConstructor
@Getter
@Setter

public class Reservation implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long numRes;
    @Temporal(TemporalType.DATE)
    private Date checkIn ;
    private Date checkOut;
    private Boolean valid;
    @Enumerated(EnumType.STRING)
    private TypeR typeReservation ;
    @OneToOne
    private Event event;







}
