package com.st.springcore.Main;

import com.st.springcore.beans.Pepsi;
import com.st.springcore.config.SpringConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class SpringMain
{
    public static void main(String[] args) throws Exception
    {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        //registering shutdown Hook
        context.registerShutdownHook();

        // In this through using Interface order is important
        Pepsi pepsi = context.getBean(Pepsi.class);
        System.out.println(pepsi);
    }
}
