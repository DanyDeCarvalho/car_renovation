package com.example.car_renovation.adresse;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Adresse {
    @Id
    private Long id;
    private String rue;
    private String code_postal;
    private String ville;
}
