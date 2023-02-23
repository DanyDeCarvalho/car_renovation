package com.example.car_renovation.client;

import com.example.car_renovation.adresse.Adresse;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Client {
    @Id
    private Long id;
    private String name;
    @OneToOne
    @JoinColumn(name = "adresseId")
    private Adresse adresse;
    private String telephone;
}
