package com.github.weiranyi.entity;

public class Cat extends Animal {
    {
        System.out.println("咪咪");
    }

    public Cat() {
    }

    public Cat(String name, Integer age) {
        super(name, age);
    }

    public void play() {
        System.out.println("玩");
    }
}
