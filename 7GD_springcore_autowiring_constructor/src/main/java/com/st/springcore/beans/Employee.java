package com.st.springcore.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee
{
    private Address address;

    public Employee()
    {

    }

    @Autowired
    public Employee(Address address)
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
