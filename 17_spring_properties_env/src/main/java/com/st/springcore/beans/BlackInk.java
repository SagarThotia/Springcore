package com.st.springcore.beans;

import com.st.springcore.interfaces.Ink;
import org.springframework.beans.factory.annotation.Value;

public class BlackInk implements Ink
{
    @Value("${blackink.brand:Cello}")
    private String brandName;

    @Value("${blackink.color:Black}")
    private String color;

    public BlackInk() {
    }

    public BlackInk(String brandName, String color)
    {
        this.brandName = brandName;
        this.color = color;
    }

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
