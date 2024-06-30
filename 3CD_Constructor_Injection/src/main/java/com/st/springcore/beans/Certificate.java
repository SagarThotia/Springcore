package com.st.springcore.beans;

public class Certificate
{
    private String name;

    public Certificate()
    {

    }

    public Certificate(String name)
    {
        this.name = name;
    }

    @Override
    public String toString()
    {
        return "name='" + name;
    }
}
