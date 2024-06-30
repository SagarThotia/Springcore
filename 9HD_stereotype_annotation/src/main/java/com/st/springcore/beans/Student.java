package com.st.springcore.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("obj")
public class Student
{
    @Value("Sam")
    private String name;

    @Value("Mumbai")
    private String city;

    public Student()
    {

    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getCity()
    {
        return city;
    }

    public void setCity(String city)
    {
        this.city = city;
    }

    @Override
    public String toString()
    {
        return "Student[" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ']';
    }
}
