package com.st.springcore.config;

import com.st.springcore.beans.Address;
import com.st.springcore.beans.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig
{

    @Bean
    public Address address()
    {
        Address address = new Address();
        address.setCity("Mumbai");
        address.setStreet("42 Backbay");
        return address;
    }

    @Bean
    @Autowired
    public Employee employee(Address address)
    {
        return new Employee(address);
    }
}
