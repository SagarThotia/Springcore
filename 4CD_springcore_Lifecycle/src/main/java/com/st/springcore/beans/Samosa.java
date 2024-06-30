package com.st.springcore.beans;

public class Samosa
{
    private double price;

    public Samosa()
    {

    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    @Override
    public String toString()
    {
        return "price=" + price;
    }

    public void hey() // init()
    {
        System.out.println("Welcome to the Chabilal Samosawala");
    }

    public void bye() // destroy()
    {
        System.out.println("Thankyou for visiting our shop visit again!!!");
    }
}
