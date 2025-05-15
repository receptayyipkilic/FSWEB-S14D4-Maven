package org.example.model;

public class Bread extends ProductForSale{

    private double weightInGrams;

    public Bread(String type, int price, String description) {
        super(type, price, description);

    }
    @Override
    public void showDetails() {
        System.out.println("Ekmek ağırlığı: " + weightInGrams);
    }
}
