package com.lambdaschool;

public class Penny extends Money {
    private static String name = "Penny";
    private int quantity;
    private double value = .01;
    private double total;

    public Penny(int quantity) {
        this.quantity += quantity;
        this.total += (double)quantity * this.value;
    }

    public Penny() {
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
