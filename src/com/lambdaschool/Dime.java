package com.lambdaschool;

public class Dime extends Money {
    private static String name = "Dime";
    private int quantity;
    private double value = .10;
    private double total;

    public Dime(int quantity) {
        this.quantity += quantity;
        this.total += (double)quantity * this.value;
    }

    public Dime() {
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
