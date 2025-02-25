package com.example.carrental;

public class Car {
    private String plateNumber;
    private String brand;
    private double price;
    private boolean rented;

    // Constructeur, getters et setters
    public Car(String plateNumber, String brand, double price, boolean rented) {
        this.plateNumber = plateNumber;
        this.brand = brand;
        this.price = price;
        this.rented = rented;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isRented() {
        return rented;
    }

    public void setRented(boolean rented) {
        this.rented = rented;
    }
}
