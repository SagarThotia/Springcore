package com.st.springcore.beans;

public class Employ
{
    private int empId;
    private String name;
    private String city;

    public Employ(int empId, String name, String city)
    {
        this.empId = empId;
        this.name = name;
        this.city = city;
    }

    @Override
    public String toString()
    {
        return "Employ{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
