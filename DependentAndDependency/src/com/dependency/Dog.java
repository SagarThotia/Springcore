package com.dependency;

public class Dog
{
    private Pedigree pedigree;

    public Dog()
    {
        this.pedigree = new Pedigree();
    }

    public void eat()
    {
        this.pedigree.eat();
    }
}
