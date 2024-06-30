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
        return "Samosa[" +
                "price=" + price +
                ']';
    }

    public void hey()
    {
        System.out.println("Inside init method: Hey How are you?");
    }

    public void bye()
    {
        System.out.println("Inside destroy method: bye bye I am going to die.");
    }
}
