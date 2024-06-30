package com.st.springcore.config;

import com.st.springcore.beans.Pepsi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig
{
    @Bean
    public Pepsi pepsi()
    {
        Pepsi pepsi = new Pepsi();
        pepsi.setPrice(40);
        return pepsi;
    }
}
