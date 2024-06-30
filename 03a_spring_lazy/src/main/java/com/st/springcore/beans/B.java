package com.st.springcore.beans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
//@Lazy(value = false)
public class B
{
    public B()
    {
        System.out.println("B constructor.");
    }

    public void m2()
    {
        System.out.println("B m2() method.");
    }
}
