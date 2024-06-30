package com.st.springcore.beans;

public class A
{
    private final B b;

    public A(final B b)
    {
        this.b = b;
    }

    public void m1()
    {
        System.out.println("A m1() method");
        System.out.println("b object is : " + b);
        b.m2();
    }

}
