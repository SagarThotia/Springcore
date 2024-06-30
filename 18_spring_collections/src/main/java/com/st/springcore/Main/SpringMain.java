package com.st.springcore.Main;

import com.st.springcore.beans.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain
{

    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");
        Employee emp = (Employee) context.getBean("employee");
        System.out.println("Employee is " + emp);
        System.out.println(emp.getEmpId());
        System.out.println(emp.getName());
        System.out.println(emp.getEmpCity());
    }
}
