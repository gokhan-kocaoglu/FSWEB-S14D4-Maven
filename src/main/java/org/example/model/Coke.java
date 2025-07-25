package org.example.model;

public class Coke extends ProductForSale{

    private double volume;

    public Coke(String type, double price, String description,double volume) {
        super(type, price, description);
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    @Override
    public void showDetails() {
        System.out.println("Product Type: " + getType());
        System.out.println("Description : " + getDescription());
        System.out.println("Price       : " + getPrice() + " TL");
        System.out.println("Volume      : " + volume + " L");
        System.out.println("-----------------------------");
    }
}
