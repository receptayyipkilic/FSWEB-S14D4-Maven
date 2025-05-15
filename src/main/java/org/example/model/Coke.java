package org.example.model;

public class Coke extends ProductForSale{

    private double liters;

    public Coke(String type, int price, String description) {
        super(type, price, description);

    }

    @Override
    public void showDetails() {

        System.out.println("Kola Litresi: " + liters);
    }
}
