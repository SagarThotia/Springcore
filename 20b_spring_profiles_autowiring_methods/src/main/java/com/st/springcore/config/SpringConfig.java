package com.st.springcore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;

@Configuration
@ComponentScan(basePackages = "com.st.springcore.beans")
public class SpringConfig
{
    @Bean
    @Profile("dev")
    public PropertySourcesPlaceholderConfigurer devEnvProperties()
    {
        PropertySourcesPlaceholderConfigurer placeholder = new PropertySourcesPlaceholderConfigurer();
        placeholder.setLocation(new ClassPathResource("sample-dev.properties"));
        return placeholder;
    }

    @Bean
    @Profile("qa")
    public PropertySourcesPlaceholderConfigurer qaEnvProperties()
    {
        PropertySourcesPlaceholderConfigurer placeholder = new PropertySourcesPlaceholderConfigurer();
        placeholder.setLocation(new ClassPathResource("sample-qa.properties"));
        return placeholder;
    }

    @Bean
    @Profile("prod")
    public PropertySourcesPlaceholderConfigurer prodEnvProperties()
    {
        PropertySourcesPlaceholderConfigurer placeholder = new PropertySourcesPlaceholderConfigurer();
        placeholder.setLocation(new ClassPathResource("sample-prod.properties"));
        return placeholder;
    }
}
