package com.github.weiranyi;

import com.github.weiranyi.entity.Animal;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MethodSample {
    public static void main(String[] args) {
        try {
            Class animalClass = Class.forName("com.github.weiranyi.entity.Dog");
            Constructor constructor = animalClass.getConstructor(new Class[]{
                    String.class, Integer.class
            });
            Animal animal = (Animal) constructor.newInstance(new Object[]{
                    "大白", 5
            });
            Method reNameMethod = animalClass.getMethod("reName", new Class[]{
                    String.class
            });
            Animal animal1=(Animal)reNameMethod.invoke(animal,new Object[]{"小白"});
            System.out.println(animal1);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
