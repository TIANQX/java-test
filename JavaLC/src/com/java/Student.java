package com.java;

/**
 * @Author tqx
 * @CreateDate 2021/1/22
 * @Description TODO
 */
public class Student {

    static String room;
    private int id;
    private String name;
    private int age;

    static int idCounter = 0;

    public Student() {
        idCounter++;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = ++idCounter;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
