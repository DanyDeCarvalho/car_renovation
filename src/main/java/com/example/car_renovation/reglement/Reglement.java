package com.example.car_renovation.reglement;

import com.example.car_renovation.client.Client;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

public class Reglement {
    @Id
    private Long id;
    private String name;
    @OneToOne
    @JoinColumn(name = "clientId")
    private Client client;

}
