package javabasics.javabasics.Java_OOP._3;

import java.util.ArrayList;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
    }

    /**
     * 1: Copy over the student class
     * <p>
     * Make sure there are 5 fields inside, if they are not simply create some more.
     * make every field private first.
     * <p>
     * Then create getters and setters for each of these 5 fields.
     * <p>
     * Once ready use all 5 below
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");

        ArrayList<Student> studenti = new ArrayList<>();
        studenti.add(new Student("Nicola", 4, "4C", "Italiano", "non-binary"));
        System.out.println(
                studenti.get(0).getName() + " " +
                        studenti.get(0).getAge() + " " +
                        studenti.get(0).getClassroom() + " " +
                        studenti.get(0).getSubject() + " " +
                        studenti.get(0).getGender()
        );
        //Voglio solo provare a vedere se il counter resetta
        System.out.println(studenti.get(0).getNameCounter(studenti));
    }

    /**
     * 2: Create 3 setter constraints for the student class
     * <p>
     * Think about what reasonably constraints are?
     * <p>
     * Should a student be able to be a negative age?
     * <p>
     * Create a counter for one of the getters, try to think about
     * what other code could be inside a getter? Why not write it?
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");

        ArrayList<Student> studenti = new ArrayList<>();
        studenti.add(new Student("Luca", 23, "3B", "francese", "maschio"));
        studenti.add(new Student("broda", 23, "3B", "francese", "maschio"));
        studenti.add(new Student("broda", 23, "3B", "francese", "maschio"));
        studenti.add(new Student("broda", 23, "3B", "francese", "maschio"));
        System.out.println(studenti.get(0).getNameCounter(studenti));

    }

}
