package com.github.weiranyi;

import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入您要Cat还是Dog:");
        String op = scanner.next();
        Animal animal;
        try {
            animal = (Animal) Class.forName("com.github.weiranyi." + op).getDeclaredConstructor().newInstance();
            System.out.println(animal);
        } catch (InstantiationException e) {
            //对象无法被实例化,抛出"实例化异常",例如抽象类无法被实例化
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            //非法访问异常,当在作用域外访问对象方法或成员变量时抛出，例如将构造方法私有化
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            //当被调用的方法的内部抛出了异常而没有被捕获时
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            //没有找到与之对应格式的方法
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            //类名与类路径书写错误是抛出"类无法找到"异常
            e.printStackTrace();
        }

    }
}
