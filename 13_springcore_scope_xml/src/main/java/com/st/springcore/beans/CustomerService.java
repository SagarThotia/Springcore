package com.st.springcore.beans;

public class CustomerService
{
   private String message;

    public CustomerService()
    {

    }

    public String getMessage()
    {
        return message;
    }

    public void setMessage(String message)
    {
        this.message = message;
    }

    @Override
    public String toString()
    {
        return "CustomerService{" +
                "message='" + message + '\'' +
                '}';
    }
}
