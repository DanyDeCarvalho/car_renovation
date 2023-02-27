package com.example.car_renovation.adresse;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Adresse {
    @Id
    private Long id;

    private String rue;
    private String code_postal;
    private String ville;

    public Adresse(Long id, String rue, String code_postal, String ville) {
        this.id = id;
        this.rue = rue;
        this.code_postal = code_postal;
        this.ville = ville;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public String getCode_postal() {
        return code_postal;
    }

    public void setCode_postal(String code_postal) {
        this.code_postal = code_postal;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public Adresse(){

    }
}
