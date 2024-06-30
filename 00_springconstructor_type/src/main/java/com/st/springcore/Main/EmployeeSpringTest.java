package com.st.springcore.Main;

import com.st.springcore.beans.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeSpringTest
{
    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");
        Employee emp = context.getBean(Employee.class);
        System.out.println("Employee is " + emp);
    }
}
