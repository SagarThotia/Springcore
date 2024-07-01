package com.st.springcore.config;

import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@Profile("qa")
@ComponentScan(basePackages = "com.st.springcore.beans")
@PropertySource("classpath:sample-qa.properties")
public class QASpringConfig
{
    @Bean
    public PropertySourcesPlaceholderConfigurer propertySource()
    {
        return new PropertySourcesPlaceholderConfigurer();
    }
}
