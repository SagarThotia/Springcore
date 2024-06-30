package com.st.springcore.config;

import com.st.springcore.beans.Certificate;
import com.st.springcore.beans.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig
{

    @Bean
    public Certificate certificate()
    {
        return new Certificate("BlockChain using Solidity and Rust");
    }

    @Bean
    public Person person(final Certificate certificate)
    {
        return new Person(12, "Sam", certificate);
    }
}
