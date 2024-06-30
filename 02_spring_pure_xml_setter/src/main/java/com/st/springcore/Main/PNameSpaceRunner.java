package com.st.springcore.Main;

import com.st.springcore.beans.Writer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PNameSpaceRunner
{
    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("p-namespace.xml");
        Writer writer = (Writer) context.getBean(Writer.class);
        writer.write();
    }
}
