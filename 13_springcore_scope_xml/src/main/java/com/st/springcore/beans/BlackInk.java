package com.st.springcore.beans;

import com.st.springcore.interfaces.Ink;

public class BlackInk implements Ink
{
    public String getBrandName()
    {
        return "Parker";
    }

    public String getColor()
    {
        return "Black";
    }
}
