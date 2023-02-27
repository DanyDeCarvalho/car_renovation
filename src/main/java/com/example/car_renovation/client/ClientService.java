package com.example.car_renovation.client;

import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ClientService {
    private final ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public List<Client> getCLient(){
        return clientRepository.findAll();
    }
}
