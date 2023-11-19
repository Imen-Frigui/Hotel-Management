package com.esprit.microservices.reclamation.entity;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Reclamation implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Enumerated(EnumType.STRING )
    private  ReclamationType type;
    private String decription;
    @Temporal(TemporalType.DATE)
    private Date date;
    private String statut;

    public Reclamation() {
        super();
    }
    public Reclamation(ReclamationType type, String decription, Date date, String statut) {
        this.type = type;
        this.decription = decription;
        this.date = date;
        this.statut = statut;
    }

    public int getId() {
        return id;
    }

    public ReclamationType getType() {
        return type;
    }

    public String getDecription() {
        return decription;
    }

    public Date getDate() {
        return date;
    }

    public String getStatut() {
        return statut;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setType(ReclamationType type) {
        this.type = type;
    }

    public void setDecription(String decription) {
        this.decription = decription;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }
}
