package com.st.springcore.Main;

import com.st.springcore.beans.Writer;
import com.st.springcore.config.Spinconfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PropsMainc
{
    public static void main(String[] args)
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(Spinconfig.class);
        Writer writer = (Writer) context.getBean("writer");
        writer.write();
    }
}
