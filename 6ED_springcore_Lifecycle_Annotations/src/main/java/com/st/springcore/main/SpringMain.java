package com.st.springcore.main;

import com.st.springcore.beans.Example;
import com.st.springcore.config.SpringConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class SpringMain
{
    public static void main(String[] args)
    {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        // registering shutdown hook
        context.registerShutdownHook();
        Example example = context.getBean(Example.class);
        System.out.println(example);
    }
}
