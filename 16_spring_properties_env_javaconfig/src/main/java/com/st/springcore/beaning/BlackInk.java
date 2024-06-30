package com.st.springcore.beaning;

import com.st.springcore.interfaces.Ink;
import org.springframework.beans.factory.annotation.Value;

public class BlackInk implements Ink
{
    @Value("${blackink.brand:Cello}")
    private String brandName;

    @Value("${blackink.color:black}")
    private String color;

    @Override
    public String getBrandName()
    {
        return brandName;
    }

    @Override
    public String getColor()
    {
        return color;
    }
}
