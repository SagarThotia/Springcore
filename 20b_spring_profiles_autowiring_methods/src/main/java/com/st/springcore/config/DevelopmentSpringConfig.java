package com.st.springcore.config;

import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@Profile("dev")
@ComponentScan(basePackages = "com.st.springcore.beans")
@PropertySource("classpath:sample-dev.properties")
public class DevelopmentSpringConfig
{
    @Bean
    public PropertySourcesPlaceholderConfigurer propertySource()
    {
        return new PropertySourcesPlaceholderConfigurer();
    }
}
