package com.st.springcore.main;

import com.st.springcore.beans.Student;
import com.st.springcore.config.SpringConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringMain
{
    public static void main(String[] args)
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        Student student = context.getBean("obj", Student.class);
        System.out.println(student);
    }
}
