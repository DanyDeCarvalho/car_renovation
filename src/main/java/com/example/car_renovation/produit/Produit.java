package com.example.car_renovation.produit;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Produit {
    @Id
    private Long id;
    private String name;
    private String description;

}
