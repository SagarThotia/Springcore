package com.st.springcore.beans;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Employee
{
    private String name;
    private List<String> phones;
    private Set<String> address;
    private Map<String,String> courses;
    private Properties properties;

    public Employee()
    {

    }

    public Employee(String name, List<String> phones, Set<String> address, Map<String, String> courses, Properties properties)
    {
        this.name = name;
        this.phones = phones;
        this.address = address;
        this.courses = courses;
        this.properties = properties;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public List<String> getPhones()
    {
        return phones;
    }

    public void setPhones(List<String> phones)
    {
        this.phones = phones;
    }

    public Set<String> getAddress()
    {
        return address;
    }

    public void setAddress(Set<String> address)
    {
        this.address = address;
    }

    public Map<String, String> getCourses()
    {
        return courses;
    }

    public void setCourses(Map<String, String> courses)
    {
        this.courses = courses;
    }

    public Properties getProperties()
    {
        return properties;
    }

    public void setProperties(Properties properties)
    {
        this.properties = properties;
    }

    @Override
    public String toString()
    {
        return "Employee{" +
                "name='" + name + '\'' +
                ", phones=" + phones +
                ", address=" + address +
                ", courses=" + courses +
                ", properties=" + properties +
                '}';
    }
}
