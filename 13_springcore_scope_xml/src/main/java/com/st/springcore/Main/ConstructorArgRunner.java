package com.st.springcore.Main;

import com.st.springcore.beans.Writer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorArgRunner {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("constructor-arg.xml");
        Writer writer = (Writer) context.getBean("writer");
        System.out.println("Writer object " + writer);
        writer.write();

        Writer writer1 = (Writer) context.getBean("writer");
        System.out.println("Writer object " + writer1);

        Writer writer2 = (Writer) context.getBean("writer");
        System.out.println("Writer object " + writer2);

        Writer writer3 = (Writer) context.getBean("writer");
        System.out.println("Writer object " + writer3);

        Writer writer4 = (Writer) context.getBean("writer");
        System.out.println("Writer object " + writer4);

        Writer writer5 = (Writer) context.getBean("writer");
        System.out.println("Writer object " + writer5);

        System.out.println("Writernew bean objects start");

        Writer writernew = (Writer) context.getBean("writernew");
        System.out.println("Writernew object " + writernew);
     }
}