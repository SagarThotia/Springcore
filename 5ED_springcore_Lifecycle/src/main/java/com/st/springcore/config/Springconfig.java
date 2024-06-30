package com.st.springcore.config;

import com.st.springcore.beans.Pepsi;
import com.st.springcore.beans.Samosa;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Springconfig
{
    @Bean
    public Samosa Samosa()
    {
        Samosa samosa = new Samosa();
        samosa.setPrice(15);
        return samosa;
    }

    @Bean
    public Pepsi pepsi()
    {
        Pepsi pepsi = new Pepsi();
        pepsi.setPrice(40);
        return pepsi;
    }
}
