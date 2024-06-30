package com.st.springcore.config;

import com.st.springcore.beans.A;
import com.st.springcore.beans.B;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = {"com.st.springcore.beans"})
//@Lazy
public class ABConfig
{
//    @Bean
//    @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
////    @Lazy
//    public A a()
//    {
//        return new A();
//    }
//
//    @Bean
//    @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
////    @Lazy
//    public B b()
//    {
//        return new B();
//    }
}
