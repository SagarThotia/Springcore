package com.looselycoupled;

import com.dependency.Dog;

public class DogOwner
{
    public static void main(String[] args)
    {
        Food food = new Bread();
        food.eat();
        com.dependency.Dog dog = new Dog(); // Error
        dog.eat();
    }
}
