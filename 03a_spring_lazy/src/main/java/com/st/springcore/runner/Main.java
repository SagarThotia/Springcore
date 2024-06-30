package com.st.springcore.runner;

import com.st.springcore.beans.A;
import com.st.springcore.beans.B;
import com.st.springcore.config.ABConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main
{
    public static void main(String[] args)
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(ABConfig.class);
        A a = (A) context.getBean("a");

        B b = (B) context.getBean("b");
    }
}
