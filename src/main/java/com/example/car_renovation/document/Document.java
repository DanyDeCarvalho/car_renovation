package com.example.car_renovation.document;

import com.example.car_renovation.adresse.Adresse;
import com.example.car_renovation.client.Client;
import com.example.car_renovation.type.Type;
import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
public class Document {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @OneToOne
    @JoinColumn(name = "client")
    private Client client;
    @OneToOne
    @JoinColumn(name="adresse_chantier", referencedColumnName="id")
    private Adresse adresse;

//    @OneToOne
//    @JoinColumn(name = "typeId")
//    private Type type;
    private LocalDate date_document;

    private String montant;

    public Document(Long id, String name, Client client, Adresse adresse, LocalDate date_document, String montant) {
        this.id = id;
        this.name = name;
        this.client = client;
        this.adresse = adresse;
        this.date_document = date_document;
        this.montant = montant;
    }
    public Document(String name, Client client, Adresse adresse, LocalDate date_document, String montant) {
        this.name = name;
        this.client = client;
        this.adresse = adresse;
        this.date_document = date_document;
        this.montant = montant;
    }

    public Document(Long id, String name, LocalDate date_document, String montant) {
        this.id = id;
        this.name = name;
        this.date_document = date_document;
        this.montant = montant;
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

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public LocalDate getDate_document() {
        return date_document;
    }

    public void setDate_document(LocalDate date_document) {
        this.date_document = date_document;
    }

    public String getMontant() {
        return montant;
    }

    public void setMontant(String montant) {
        this.montant = montant;
    }

    public Document() {
        // Constructeur par défaut vide
    }
}
