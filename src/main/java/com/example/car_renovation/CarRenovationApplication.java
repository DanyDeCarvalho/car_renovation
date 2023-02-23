package com.example.car_renovation;

import com.example.car_renovation.document.Document;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
@RestController
public class CarRenovationApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarRenovationApplication.class, args);
	}

}
