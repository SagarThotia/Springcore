package com.st.springcore.config;

import com.st.springcore.beans.A;
import com.st.springcore.beans.B;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ConfigAB
{
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public A a(B b)
    {
        return new A(b);
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public B b()
    {
        return  new B();
    }
}
