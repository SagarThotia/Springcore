package com.st.springcore.main;

import com.st.springcore.beans.Employee;
import com.st.springcore.config.SpringConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringMain
{
    public static void main(String[] args)
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        Employee employee = (Employee) context.getBean(Employee.class);
        System.out.println(employee);
    }
}
