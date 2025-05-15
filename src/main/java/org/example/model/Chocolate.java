package org.example.model;

public class Chocolate extends ProductForSale{

    private String brand;

    public Chocolate(String type, int price, String description) {
        super(type, price, description);
        this.brand = brand;
    }

    @Override
    public void showDetails() {
        System.out.println("Çikolata Markası: " + brand);
    }
}
