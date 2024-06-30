package com.st.springcore.config;

import com.st.springcore.beans.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.*;

@Configuration
public class SpringConfig
{
    @Bean
    public Employee employee()
    {
        Employee emp = new Employee();
        emp.setName("Sam");

        List<String> phone = new ArrayList<>();
        phone.add("9526358971");
        phone.add("9863457821");
        phone.add("7563248912");

        emp.setPhones(phone);

        Set<String> address = new HashSet<>();
        address.add("Carslie");
        address.add("Birmingham");
        address.add("London");
        address.add("Manchestor");

        emp.setAddress(address);

        Map<String,String> course = new HashMap<>();
        course.put("Java","2 Months");
        course.put("Python","1.2 Month");
        course.put("C", "1 Month");

        emp.setCourses(course);

        Properties properties = new Properties();
        properties.put("username","Sagar");
        properties.put("password","PerlCamel@21");

        emp.setProperties(properties);

        return emp;
    }

}
