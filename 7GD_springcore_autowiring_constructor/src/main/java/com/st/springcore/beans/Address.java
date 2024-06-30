package com.st.springcore.beans;

import org.springframework.stereotype.Component;

@Component
public class Address
{
    private String street;
    private String city;

    public Address()
    {

    }

    public Address(String street, String city)
    {
        this.street = street;
        this.city = city;
    }

    @Override
    public String toString()
    {
        return "Address[" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ']';
    }
}
