package com.example.carrental;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {

    private List<Car> cars = new ArrayList<>();

    public CarController() {
        // Ajouter des voitures de test
        cars.add(new Car("11AA22", "Ferrari", 100.0, false));
        cars.add(new Car("33BB44", "Porsche", 150.0, false));
    }

    // Endpoint pour obtenir la liste des voitures
    @GetMapping("/cars")
    public List<Car> listOfCars() {
        return cars;
    }

    // Endpoint pour obtenir une voiture spécifique en fonction de la plaque
    @GetMapping("/cars/{plateNumber}")
    public Car aCar(@PathVariable("plateNumber") String plateNumber) {
        return cars.stream().filter(car -> car.getPlateNumber().equals(plateNumber)).findFirst().orElse(null);
    }
}
