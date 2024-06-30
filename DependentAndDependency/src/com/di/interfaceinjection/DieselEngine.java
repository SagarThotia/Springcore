package com.di.interfaceinjection;

public class DieselEngine implements Engine
{
    @Override
    public void run()
    {
        System.out.println("Diesel engine is running");
    }
}
