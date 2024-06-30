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
        Address address = new Address();
        address.setCity("Durres");
        address.setStreet("42 saint beach");
        return address;
    }

    @Bean
    public Address address1()
    {
        Address address = new Address();
        address.setCity("Heilbronn");
        address.setStreet("42 pound lake");
        return address;
    }

    @Bean
    public Employee employee()
    {
        return new Employee();
    }
}
