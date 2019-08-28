package org.katas.refactoring;

public class LineItem {
    private String desc;
    private double price;
    private int quality;

    public LineItem(String desc, double price, int quality) {
        super();
        this.desc = desc;
        this.price = price;
        this.quality = quality;
    }

    public String getDescription() {
        return desc;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quality;
    }

    double totalAmount() {
        return price * quality;
    }
}