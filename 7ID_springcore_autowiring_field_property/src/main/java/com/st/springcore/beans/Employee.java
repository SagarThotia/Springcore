package com.st.springcore.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee
{
    @Autowired
    private Address address;

    public Employee()
    {

    }

    public Employee(Address address)
    {
        this.address = address;
    }

    public Address getAddress()
    {
        return address;
    }

    public void setAddress(Address address)
    {
        this.address = address;
    }

    @Override
    public String toString()
    {
        return "Employee[" +
                "address=" + address +
                ']';
    }
}
