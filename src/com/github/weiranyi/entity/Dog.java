package com.github.weiranyi.entity;

public class Dog extends Animal {
    {
        System.out.println("狗子");
    }

    public Dog() {
    }

    public Dog(String name, Integer age) {
        super(name, age);
    }

    public void lookdoor() {
        System.out.println("看门");
    }
}
