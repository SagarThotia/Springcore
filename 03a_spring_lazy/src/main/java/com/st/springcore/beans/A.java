package com.st.springcore.beans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
//@Lazy
@Lazy(value = true)
public class A
{
    private B b;

    public A()
    {
        System.out.println("A constructor.");
    }

    public A(B b)
    {
        this.b = b;
    }

    public void m1()
    {
        System.out.println("A m1() method");

        System.out.println("b object is :" + b);
        b.m2();
    }
}
