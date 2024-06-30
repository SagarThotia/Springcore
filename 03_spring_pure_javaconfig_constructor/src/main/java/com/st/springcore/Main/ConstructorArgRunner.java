package com.st.springcore.Main;

import com.st.springcore.beans.Writer;
import com.st.springcore.config.SpringConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConstructorArgRunner
{
    public static void main(String[] args)
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        Writer writer = context.getBean(Writer.class);
        writer.write();
    }
}
