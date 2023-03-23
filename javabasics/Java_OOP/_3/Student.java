package javabasics.javabasics.Java_OOP._3;

import java.util.ArrayList;

public class Student {
    private String name;
    private int age;
    private String classroom;
    private String subject;

    private String gender;
    private int nameCounter = 0;

    public Student(String name, int age, String classroom, String subject, String gender) {
        setName(name);
        setAge(age);
        setClassroom(classroom);
        setSubject(subject);
        setGender(gender);

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


    public String getClassroom() {
        return classroom;
    }

    public String getSubject() {
        return subject;
    }

    public String getGender() {
        return gender;
    }

    public void setName(String name) {
        nameCounter += 1;
        this.name = name;
    }

    public void setAge(int age) {
        if (age < 5) {
            System.out.println(this.name+" dovresti stare all'asilo");
            this.age=age;
        } else {
            this.age = age;
        }
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setGender(String gender) {
        if (gender.equals("non-binary")) {
            this.gender = "Sei bannato da questo codice";
        } else {
            this.gender = gender;
        }
    }

    public int getNameCounter(ArrayList array) {
        nameCounter = array.size();
        return nameCounter;
    }
}