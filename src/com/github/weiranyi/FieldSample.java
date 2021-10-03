package com.github.weiranyi;

import com.github.weiranyi.entity.Animal;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class FieldSample {
    public static void main(String[] args) {

        try {
            Class animalClass = Class.forName("com.github.weiranyi.entity.People");
            Constructor constructor = animalClass.getConstructor(new Class[]{
                    String.class, Integer.class, String.class
            });
            Animal people = (Animal) constructor.newInstance(new Object[]{"蔚然", 9, "计算机科学与技术"});
            System.out.println(people);
            Field major = animalClass.getField("major");
            String fieldMajor = (String) major.get(people);
            System.out.println(fieldMajor);
            major.set(people, "软件开发");
            fieldMajor = (String) major.get(people);
            System.out.println(fieldMajor);
            System.out.println(people);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }

    }
}
