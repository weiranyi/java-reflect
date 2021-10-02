package com.github.weiranyi;

public class Cat extends Animal {
    {
        System.out.println("咪咪");
    }

    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    public void play() {
        System.out.println("玩");
    }
}
