package com.courses.spalah.Temp;

/**
 * Created by artem on 21.08.2016.
 */
public class Cat {
    private String name;
    private int age;

    public Cat(String s, int a) {
        this.name = s;
        this.age = a;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


    public String toString() {
        String s = "Cat name: " + name + ", cat age: " + age;
        return s;
    }
}
