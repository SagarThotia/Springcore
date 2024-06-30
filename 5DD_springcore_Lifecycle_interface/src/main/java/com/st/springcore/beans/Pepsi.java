package com.st.springcore.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean, DisposableBean
{
    private double price;

    public Pepsi()
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
        return "Pepsi[" +
                "price=" + price +
                ']';
    }

    public void afterPropertiesSet() throws Exception
    {
        // init method work
        System.out.println("Taking Pepsi: init");
    }

    public void destroy() throws Exception
    {
        // destroy method
        System.out.println("Going to put bottle back to shop: destroy");
    }
}
