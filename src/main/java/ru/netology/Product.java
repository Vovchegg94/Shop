package ru.netology;

public abstract class Product {
    protected String name;
    protected String model;
    protected int price;
    protected String producer;

    protected String typeString;

    public Product(String name, String model, int price, String producer) {
        this.name = name;
        this.model = model;
        this.price = price;
        this.producer = producer;

    }


    public int getPrice() {
        return this.price;
    }
}
