package com.example.cafepizza.model_entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "pizza")
public class Pizza {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id_pizza;


    public void setId_pizza(String idPizza) {
        this.id_pizza = idPizza;
    }

    public String getId_pizza() {
        return id_pizza;
    }
}
