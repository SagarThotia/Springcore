package com.st.springcore.Config;

import com.st.springcore.beans.Samosa;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LifeCycleConfig
{

    @Bean
    public Samosa samosa()
    {
        Samosa samosa = new Samosa();
        samosa.setPrice(15);
        return samosa;
    }
}
