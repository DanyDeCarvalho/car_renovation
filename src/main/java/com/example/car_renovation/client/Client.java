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

    public Client(Long id, String name, Adresse adresse, String telephone) {
        this.id = id;
        this.name = name;
        this.adresse = adresse;
        this.telephone = telephone;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Client() {

    }
}
