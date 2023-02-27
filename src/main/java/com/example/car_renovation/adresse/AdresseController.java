package com.example.car_renovation.adresse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/adresse")
public class AdresseController {

    private final AdresseService adresseService;
    @Autowired
    public AdresseController(AdresseService adresseService) {
        this.adresseService = adresseService;
    }
    @GetMapping(value = "/getAll")
    public List<Adresse> getDocument() {
        return adresseService.getAdresse();
    }
}
