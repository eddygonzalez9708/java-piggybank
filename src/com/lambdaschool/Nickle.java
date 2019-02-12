package com.lambdaschool;

public class Nickle extends Money {
    private static String name = "Nickle";
    private int quantity;
    private double value = .05;
    private double total;

    public Nickle(int quantity) {
        this.quantity += quantity;
        this.total += (double)quantity * this.value;
    }

    public Nickle() {
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
