package com.st.springcore.Main;

import com.st.springcore.Config.LifeCycleConfig;
import com.st.springcore.beans.Samosa;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class SpringMain
{
    public static void main(String[] args)
    {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(LifeCycleConfig.class);
        Samosa samosa = context.getBean(Samosa.class);
//        samosa.hey();
        System.out.println(samosa);
//        samosa.bye();
        context.registerShutdownHook();
    }
}
