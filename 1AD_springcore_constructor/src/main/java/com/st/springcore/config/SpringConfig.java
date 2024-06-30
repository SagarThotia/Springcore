package com.st.springcore.config;

import com.st.springcore.beans.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig
{
    @Bean
    public Student student()
    {
        return new Student(105,"Jennifer Matson","Manchestor");
    }
}
