package com.st.springcore.config;

import com.st.springcore.beans.BlackInk;
import com.st.springcore.beans.FountainPen;
import com.st.springcore.beans.Writer;
import com.st.springcore.interfaces.Ink;
import com.st.springcore.interfaces.Pen;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class SpringConfig
{
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Writer writer(Pen pen)
    {
        return new Writer(pen);
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
    public FountainPen fountainPen(Ink ink)
    {
        return new FountainPen(ink);
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
    public BlackInk blackInk()
    {
        return new BlackInk();
    }
}
