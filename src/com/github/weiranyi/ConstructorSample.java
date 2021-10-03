package com.github.weiranyi;

import com.github.weiranyi.entity.Animal;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

//构造函数
public class ConstructorSample {
    public static void main(String[] args) {
        try {
            Class animalClass = Class.forName("com.github.weiranyi.entity." + "Cat");
            Constructor constructor = animalClass.getConstructor(new Class[]{
                    String.class, Integer.class
            });
            Animal animal = (Animal) constructor.newInstance("小喵", 6);
            System.out.println(animal);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            //当被调用的方法的内部抛出了异常而没有被捕获时
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
