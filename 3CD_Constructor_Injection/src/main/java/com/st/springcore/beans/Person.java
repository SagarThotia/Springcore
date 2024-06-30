package com.st.springcore.beans;


public class Person
{
    private int personId;
    private String name;
    private Certificate certificate;

    public Person()
    {

    }

    public Person(int personId, String name, Certificate certificate)
    {
        this.personId = personId;
        this.name = name;
        this.certificate = certificate;
    }

    @Override
    public String toString()
    {
        return "Person{" +
                "personId=" + personId +
                ", name='" + name + '\'' +
                ", certificate=" + certificate +
                '}';
    }
}
