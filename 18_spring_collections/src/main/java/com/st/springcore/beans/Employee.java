package com.st.springcore.beans;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee
{
    private Set<String> empId;
    private List<String> name;
    private Map<String,String> empCity;

    public Employee()
    {

    }

    public Employee(Set<String> empId, List<String> name, Map<String, String> empCity)
    {
        this.empId = empId;
        this.name = name;
        this.empCity = empCity;
    }

    public Set<String> getEmpId()
    {
        return empId;
    }

    public void setEmpId(Set<String> empId)
    {
        this.empId = empId;
    }

    public List<String> getName()
    {
        return name;
    }

    public void setName(List<String> name)
    {
        this.name = name;
    }

    public Map<String, String> getEmpCity()
    {
        return empCity;
    }

    public void setEmpCity(Map<String, String> empCity)
    {
        this.empCity = empCity;
    }

    @Override
    public String toString()
    {
        return "Employee{" +
                "empId=" + empId +
                ", name=" + name +
                ", empCity=" + empCity +
                '}';
    }
}
