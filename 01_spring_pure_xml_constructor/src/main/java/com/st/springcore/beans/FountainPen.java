package com.st.springcore.beans;

import com.st.springcore.interfaces.Ink;
import com.st.springcore.interfaces.Pen;

public class FountainPen implements Pen
{
    private final Ink ink;

    public FountainPen(final Ink ink)
    {
        this.ink = ink;
    }

    @Override
    public void write()
    {
        System.out.println("Writing with " + ink.getColor() + " ink of " + ink.getBrandName() + " brand");
    }
}
