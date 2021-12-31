package com.github.lacquerednocap.FirstJavaEE.logic;

import java.util.Random;

public class Cart {
    private final long id;
    private String name;
    private int quantity;

    public Cart() {
        this.id = new Random().nextLong();
    }


    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
