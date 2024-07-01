package com.st.springcore.beans;

import com.st.springcore.interfaces.Ink;
import com.st.springcore.interfaces.Pen;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class FountainPen implements Pen
{
    private Ink ink;

    @Inject
    public FountainPen(Ink ink)
    {
        this.ink = ink;
    }


    public void write()
    {
        System.out.println("Writing with " + ink.getColor() + " ink of " + ink.getBrandName() + " brand");

    }
}
