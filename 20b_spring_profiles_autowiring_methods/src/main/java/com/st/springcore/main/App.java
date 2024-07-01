package com.st.springcore.main;

import com.st.springcore.beans.Writer;
import com.st.springcore.config.SpringConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App
{
    public static void main(String[] args)
    {
//        System.setProperty("spring.profiles.active","dev");
//        System.setProperty("spring.profiles.active","qa");
        System.setProperty("spring.profiles.active","prod");

        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        Writer writer = context.getBean(Writer.class);
        writer.write();
    }
}