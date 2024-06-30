package com.di.interfaceinjection;

public class InterfaceInjection
{
    public static void main(String[] args)
    {
        // Client code
        Engine engine = new DieselEngine();
        Car car = new Car();
        car.setEngine(engine);
        car.start();
    }
}
