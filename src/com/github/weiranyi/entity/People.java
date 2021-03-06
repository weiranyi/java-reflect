package com.github.weiranyi.entity;

public class People extends Animal {
    public String major;
    private int phoneNumber = 188191;

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public People() {
    }

    public People(String major) {
        this.major = major;
    }

    public People(String name, Integer age, String major) {
        super(name, age);
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + this.getName() + '\'' +
                ", age=" + this.getAge() + '\'' +
                ", major='" + major + '\'' +
                '}';
    }

}
