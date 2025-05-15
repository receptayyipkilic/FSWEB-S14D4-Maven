package org.example.model;

public class Store {
    public static void main(String[] args) {

        //listProducts();
    }

    public static void listProducts(ProductForSale[] products) {

        for (int i = 0; i < products.length; i++){
          products[i].showDetails();
        }
    }
}