package com.st.springcore.Main;

import com.st.springcore.beans.Writer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CNameSpaceRunner
{
    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("c-namespace.xml");
        Writer writer = (Writer) context.getBean(Writer.class);
        writer.write();
    }
}
