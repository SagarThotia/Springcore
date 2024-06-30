package com.st.springcore.config;

import com.st.springcore.beans.BlackInk;
import com.st.springcore.beans.FountainPen;
import com.st.springcore.beans.Writer;
import com.st.springcore.interfaces.Ink;
import com.st.springcore.interfaces.Pen;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

@Configuration
@ComponentScan(basePackages = "com.st.springcore.beans")
@PropertySource("classpath:sample.properties")
public class Spinconfig
{
    @Autowired
    private Environment environment;

    @Bean
    public Writer writer(@Qualifier("FountainPen") Pen pen)
    {
        return new Writer(pen);
    }

    @Bean
    public Pen FountainPen(Ink ink)
    {
        return new FountainPen(ink);
    }

    @Bean
    public Ink blackInk()
    {
        return new BlackInk();
    }

    @Bean
    public PropertySourcesPlaceholderConfigurer propertySource()
    {
        return new PropertySourcesPlaceholderConfigurer();
    }
}
