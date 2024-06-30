package com.st.springcore.Main;

import com.st.springcore.beans.Employee;
import com.st.springcore.config.SpringConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringMain
{
    public static void main(String[] args)
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        Employee emp = context.getBean(Employee.class);
        System.out.println(emp);
    }
}
