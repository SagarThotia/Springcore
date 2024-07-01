package com.st.springcore.beans;

import com.st.springcore.interfaces.Ink;
import org.springframework.beans.factory.annotation.Value;

import javax.inject.Named;

@Named
public class BlackInk implements Ink
{
    @Value("${blackink.brand:sam}")
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
