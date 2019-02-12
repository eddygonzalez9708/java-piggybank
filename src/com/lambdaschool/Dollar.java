package com.lambdaschool;

public class Dollar extends Money {
    private static String name = "Dollar";
    private int quantity;
    private double value = 1.00;
    private double total;

    public Dollar(int quantity) {
        this.quantity += quantity;
        this.total += (double)quantity * this.value;
    }

    public Dollar() {
        this.quantity++;
        this.total += this.value;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getQuantity() {
        return quantity;
    }

    @Override
    public double getTotal() {
        return total;
    }
}
