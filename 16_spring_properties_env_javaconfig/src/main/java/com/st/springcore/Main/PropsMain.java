package com.st.springcore.Main;

import com.st.springcore.beans.Writer;
import com.st.springcore.config.SpringConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PropsMain
{
    public static void main(String[] args)
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        Writer writer = (Writer) context.getBean("writer");
        writer.write();
    }
}
