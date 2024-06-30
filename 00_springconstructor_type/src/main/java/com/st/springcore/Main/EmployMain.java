package com.st.springcore.Main;

import com.st.springcore.beans.Employ;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployMain
{
    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("Springcong.xml");
        Employ emp = context.getBean(Employ.class);
        System.out.println("Employee is " + emp);
    }
}
