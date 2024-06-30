package com.st.springcore.main;

import com.st.springcore.beans.Pepsi;
import com.st.springcore.beans.Samosa;
import com.st.springcore.config.Springconfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class SpringMain
{
    public static void main(String[] args)
    {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(Springconfig.class);
        context.registerShutdownHook();
        Samosa samosa = context.getBean(Samosa.class);
        samosa.hey();
        System.out.println(samosa);
        System.out.println("********************************************************");
        Pepsi pepsi = context.getBean(Pepsi.class);
        System.out.println(pepsi);
        samosa.bye();
    }
}
