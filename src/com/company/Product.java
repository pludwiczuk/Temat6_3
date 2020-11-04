package com.company;

public class Product implements ProductInterface{
    public double price;

    public Product(double price)
    {
        this.price = price;
    }

    public double calculateBargainPrice(){return 0;}
    public double getPrice()
    {
        return price;
    }
    public void setPrice(double price)
    {
        this.price = price;
    }
}