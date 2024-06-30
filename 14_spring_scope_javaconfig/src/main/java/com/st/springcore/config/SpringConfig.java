package com.st.springcore.config;

import com.st.springcore.beans.BlackInk;
import com.st.springcore.beans.FountainPen;
import com.st.springcore.beans.Writer;
import com.st.springcore.interfaces.Ink;
import com.st.springcore.interfaces.Pen;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig
{
    @Bean
    public Writer writer(Pen pen)
    {
        return new Writer(pen);
    }

    @Bean
    public FountainPen fountainPen(Ink ink)
    {
        return new FountainPen(ink);
    }

    @Bean
    public BlackInk blackInk()
    {
        return new BlackInk();
    }

}
