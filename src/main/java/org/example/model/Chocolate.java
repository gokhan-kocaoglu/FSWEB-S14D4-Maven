package org.example.model;

public class Chocolate extends ProductForSale{
    private int cocoaPercent;

    public Chocolate(String type, double price, String description,int cocoaPercent) {
        super(type, price, description);
        this.cocoaPercent = cocoaPercent;
    }

    public int getCocoaPercent() {
        return cocoaPercent;
    }

    @Override
    public void showDetails() {
        System.out.println("Product Type: " + getType());
        System.out.println("Description : " + getDescription());
        System.out.println("Price       : " + getPrice() + " TL");
        System.out.println("Cocoa Percent: " + cocoaPercent + "%");
        System.out.println("-----------------------------");
    }
}
