package com.github.weiranyi;

import com.github.weiranyi.entity.Animal;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

public class getDeclaredSample {
    public static void main(String[] args) {
        try {
            Class animalClass = Class.forName("com.github.weiranyi.entity.People");
            Constructor constructor = animalClass.getConstructor(new Class[]{
                    String.class, Integer.class, String.class
            });
            Animal people = (Animal) constructor.newInstance(new Object[]{"蔚然", 9, "计算机科学与技术"});
            //获取当前类所有成员变量
            Field[] fields = animalClass.getDeclaredFields();
            for (Field field : fields) {
                if (field.getModifiers() == 1) {
                    // public修饰
                    Object val = field.get(people);
                    System.out.println(field.getName() + ":" + val);
                } else if (field.getModifiers() == 2) {
                    // private修饰
                    String methodName = "get" + field.getName().substring(0, 1).toUpperCase()
                            + field.getName().substring(1);
                    Method getMethod = animalClass.getMethod(methodName);
                    Object o = getMethod.invoke(people);
                    System.out.println(field.getName() + ":" + o);
                }
            }
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
