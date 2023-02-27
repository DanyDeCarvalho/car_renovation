package com.example.car_renovation.adresse;


import com.example.car_renovation.document.DocumentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AdresseService {
    private final AdresseRepository adresseRepository;

    public AdresseService(AdresseRepository adresseRepository) {
        this.adresseRepository = adresseRepository;
    }

    public List<Adresse> getAdresse() {
        return adresseRepository.findAll();
    }
}
