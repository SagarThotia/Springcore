package com.st.springcore.beans;

import com.st.springcore.interfaces.Ink;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component
//@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class BlackInk implements Ink
{
    private final String brandName;
    private final String color;

    public BlackInk(final String brandName, final String color)
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
