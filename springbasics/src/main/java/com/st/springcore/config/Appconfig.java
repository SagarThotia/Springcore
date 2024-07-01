package com.st.springcore.config;

import com.st.springcore.dao.DummyProductDao;
import com.st.springcore.dao.JdbcProductDao;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Configuration
public class Appconfig
{

    public Appconfig()
    {
        System.out.println("AppConfig instantiated");
    }

    @Lazy
    @Bean
    public DummyProductDao dummyDao()
    {
        System.out.println("AppConfig.dummyDao() called");
        return new DummyProductDao();
    }

    @Lazy
    @Scope("singleton")
    @Bean
    public JdbcProductDao jdbcDao()
    {
        System.out.println("AppConfig.jdbcDao() called");
        return new JdbcProductDao();
    }
}
