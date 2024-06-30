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
        Writer writer = new Writer();
        writer.setPen(pen);
        return writer;
    }

    @Bean
    public Pen fountainPen(Ink ink)
    {
        FountainPen fountainPen = new FountainPen();
        fountainPen.setInk(ink);
        return fountainPen;
    }

    @Bean
    public Ink blackInk()
    {
        return new BlackInk();
    }
}
