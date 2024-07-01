package com.st.springcore.config;

import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@Profile(value = "prod")
@ComponentScan(basePackages = "com.st.springcore.beans")
@PropertySource("classpath:sample-prod.properties")
public class ProductionSpringConfig
{
    @Bean
    public PropertySourcesPlaceholderConfigurer propertySource()
    {
        return new PropertySourcesPlaceholderConfigurer();
    }

}
