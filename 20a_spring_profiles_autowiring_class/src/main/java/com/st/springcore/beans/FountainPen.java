package com.st.springcore.beans;

import com.st.springcore.interfaces.Ink;
import com.st.springcore.interfaces.Pen;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FountainPen implements Pen
{
    private Ink ink;

    @Autowired
    public FountainPen(Ink ink)
    {
        this.ink = ink;
    }

    @Override
    public void write()
    {
        System.out.println("Writing with " + ink.getColor() + " ink of " + ink.getBrandName() + " brand");
    }
}
