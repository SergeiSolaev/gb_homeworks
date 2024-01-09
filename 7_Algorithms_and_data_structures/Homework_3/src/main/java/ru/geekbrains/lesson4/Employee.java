package ru.geekbrains.lesson4;

public class Employee {

    private String name;

    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return String.format("(name: %s, age: %d)", this.name, this.age);
    }
}
