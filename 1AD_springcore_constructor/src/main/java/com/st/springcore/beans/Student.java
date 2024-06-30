package com.st.springcore.beans;

public class Student
{
    private int studentId;
    private String name;
    private String address;

    public Student()
    {

    }

    public Student(int studentId, String name, String address)
    {
        this.studentId = studentId;
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString()
    {
        return "Student{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
