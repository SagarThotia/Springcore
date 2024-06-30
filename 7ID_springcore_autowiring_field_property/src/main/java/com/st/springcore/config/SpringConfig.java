package com.st.springcore.config;

import com.st.springcore.beans.Address;
import com.st.springcore.beans.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig
{
    @Bean
    public Address address()
    {
        return new Address("Durres","42 saint Beach");
    }

    @Bean
    public Employee employee(Address address)
    {
        return new Employee(address);
    }
}
