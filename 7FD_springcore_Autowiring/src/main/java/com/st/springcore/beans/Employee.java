package com.st.springcore.beans;

public class Employee
{
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
                "Address=" + address +
                ']';
    }
}
