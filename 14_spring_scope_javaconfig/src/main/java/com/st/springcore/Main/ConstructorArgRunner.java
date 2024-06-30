package com.st.springcore.Main;

import com.st.springcore.beans.FountainPen;
import com.st.springcore.beans.Writer;
import com.st.springcore.config.SpringConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConstructorArgRunner {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        Writer writer = (Writer) context.getBean("writer");
        writer.write();
        Writer writer1 = (Writer) context.getBean("writer");
        System.out.println("Writer object is :" + writer);
        System.out.println("Writer1 object is :" + writer1);

        System.out.println("Fountain pen flow");

        FountainPen fountainPen = (FountainPen) context.getBean("fountainPen");
        System.out.println("Fountain pen is : " + fountainPen);
        FountainPen fountainPen1 = (FountainPen) context.getBean("fountainPen");
        System.out.println("Fountain1 pen is : " + fountainPen1);
     }
}