package com.esprit.microservices.reclamation.entity;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

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
    private String description;
    @Temporal(TemporalType.DATE)
    private Date date;
    private String status = "pending";
    @ManyToOne
    @JoinColumn(name = "user_id")
    private  User user;

    public Reclamation() {
        super();
        this.status = "pending";
    }

    public Reclamation(int id, ReclamationType type, String description, Date date, String status, User user) {
        this.id = id;
        this.type = type;
        this.description = description;
        this.date = date;
        this.status = status;
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public ReclamationType getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }

    public Date getDate() {
        return date;
    }

    public String getStatus() {
        return status;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setType(ReclamationType type) {
        this.type = type;
    }

    public void setDescription(String decription) {
        this.description = decription;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void accept() {
        this.status = "accepted";
    }

    public void reject() {
        this.status = "rejected";
    }
}
