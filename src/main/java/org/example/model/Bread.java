package org.example.model;

public class Bread extends ProductForSale{

    private boolean isWholeWheat;

    public Bread(String type, double price, String description,boolean isWholeWheat) {
        super(type, price, description);
        this.isWholeWheat = isWholeWheat;
    }

    public boolean isWholeWheat() {
        return isWholeWheat;
    }

    @Override
    public void showDetails() {
        System.out.println("Product Type: " + getType());
        System.out.println("Description : " + getDescription());
        System.out.println("Price       : " + getPrice() + " TL");
        System.out.println("Whole Wheat : " + (isWholeWheat ? "Yes" : "No"));
        System.out.println("-----------------------------");
    }
}
