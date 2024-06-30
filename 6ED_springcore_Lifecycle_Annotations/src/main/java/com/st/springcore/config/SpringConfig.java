package com.st.springcore.config;

import com.st.springcore.beans.Example;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.CommonAnnotationBeanPostProcessor;

@Configuration
public class SpringConfig
{
    @Bean
    public Example example()
    {
        Example example = new Example();
        example.setSubject("Java");
        return example;
    }

    public CommonAnnotationBeanPostProcessor commonAnnotationBeanPostProcessor()
    {
        return  new CommonAnnotationBeanPostProcessor();
    }
}
