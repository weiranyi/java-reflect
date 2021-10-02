package com.github.weiranyi;

public class Dog extends Animal{
    {
        System.out.println("小白");
    }
    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }
    public void lookdoor(){
        System.out.println("看门");
    }
}
