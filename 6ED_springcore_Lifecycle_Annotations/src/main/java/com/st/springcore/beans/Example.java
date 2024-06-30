package com.st.springcore.beans;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class Example
{
    private String subject;

    public Example()
    {

    }

    public String getSubject()
    {
        return subject;
    }

    public void setSubject(String subject)
    {
        this.subject = subject;
    }

    @Override
    public String toString()
    {
        return "Example[" +
                "subject='" + subject + '\'' +
                ']';
    }

    @PostConstruct
    public void start()
    {
        System.out.println("Starting Method");
    }

    @PreDestroy
    public void end()
    {
        System.out.println("Ending Method");
    }
}
