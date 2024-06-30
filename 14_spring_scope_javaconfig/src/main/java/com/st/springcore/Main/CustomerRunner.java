package com.st.springcore.Main;

import com.st.springcore.beans.CustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerRunner
{
    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");

        CustomerService customerA = (CustomerService) context.getBean("customerService");
        customerA.setMessage("Message by CustomerA");
        System.out.println("Message : " + customerA.getMessage());
        System.out.println("CustomerA hashcode : " + customerA);

        // retrieve it again
        CustomerService customerB = (CustomerService) context.getBean("customerService");
        System.out.println("Message : " + customerB.getMessage());
        System.out.println("CustomerB hashcode : " + customerB);
    }
}
