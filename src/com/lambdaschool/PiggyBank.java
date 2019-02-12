package com.lambdaschool;

import java.util.ArrayList;

public class PiggyBank {
    private ArrayList<Money> account = new ArrayList<Money>();
    private double total;

    public void add(Money money) {
        this.total += money.getTotal();
        this.account.add(money);
    }

    public void print() {
        for (Money money : account) {
            int quantity = money.getQuantity();
            String name = money.getName();

            if (name == "Dollar") {
                System.out.println("$" + quantity);
            } else {
                System.out.println(quantity + " " + name);
            }
        }
    }

    public void value() {
        System.out.println("The piggy bank holds $" + this.total);
    }
}
