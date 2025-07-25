package org.example.model;

public class Store {
    public static void main(String[] args) {

        ProductForSale[] products = new ProductForSale[3];
        products[0] = new Chocolate("Chocolate", 40, "Bitter Çikolata", 80);
        products[1] = new Coke("Coke", 25, "Buz gibi kola", 1.5);
        products[2] = new Bread("Bread", 10, "Taze köy ekmeği", true);

        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
        for (ProductForSale product : products) {
            product.showDetails();
        }
    }
}