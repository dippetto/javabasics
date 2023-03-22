package javabasics.javabasics.Java_OOP._2;

public class Student {String name;
    int age;


    public Student(String name, int age) {
        System.out.println("Constructing");
        this.name = name;
        this.age = age;
        System.out.println("Constructed");
    }

    public Student(int age) {
        this.age = age;
    }

    public Student(String name) {
        this.name = name;
    }

    public Student () {

    }


}