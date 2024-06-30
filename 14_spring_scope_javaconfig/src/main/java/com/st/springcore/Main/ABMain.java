package com.st.springcore.Main;

import com.st.springcore.beans.A;
import com.st.springcore.config.ConfigAB;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ABMain
{
    public static void main(String[] args)
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigAB.class);
        A a = (A) context.getBean("a");
        A a1 = (A) context.getBean("a");
        A a2 = (A) context.getBean("a");
        A a3 = (A) context.getBean("a");
        A a4 = (A) context.getBean("a");
        System.out.println("A is : " + a);
        System.out.println("A is : " + a1);
        System.out.println("A is : " + a2);
        System.out.println("A is : " + a3);
        System.out.println("A is : " + a4);
        a.m1();
        a1.m1();
        a2.m1();
        a3.m1();
        a4.m1();
        ((AnnotationConfigApplicationContext)context).close();
    }
}
