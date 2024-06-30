package com.st.springcore.Main;

import com.st.springcore.beans.Writer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorArgRunner
{
    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("constructor-arg.xml");
        Writer writer = (Writer) context.getBean("writer");
        writer.write();
    }
}
