package javabasics._16;

import java.util.Arrays;
import java.util.List;

public class Main {



    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    /**
     * 1: Take the code below and put it into a function, read the code and see what it is.
     * <p>
     * What do you think the function does? Name the function appropriately and make sure
     * <p>
     * return the appropriate result type
     *
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");


           double testFunction=fahrenheitConversion(10);

    }
    private static double fahrenheitConversion(double celsius){
        double fahrenheit = ((celsius * 9) / 5) + 32;
        String conversionDescription = celsius + " Celsius is " + fahrenheit + " fahrenheit";
        System.out.println(conversionDescription);
        return fahrenheit;

    }

    /**
     * 2: Create a function that processes and prints out all the names in the ArrayList
     *
     *    Make sure to put all the formatting code in the function, formatting:
     *    1) to Upper case
     *    2) Remove spaces at the start and the end
     *    3) If the name contains any numbers, instead of returning the name, return "Invalid"
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");
        List<String> names = Arrays.asList("Alan   ", "Alice9   ", "Ant0ni0   ", "  Aziz");

        for (String name : names) {
          String checkNames=checkNamesFunction(name);
        }
    }
    private static String checkNamesFunction(String name){
        if(name.contains("0")){
            System.out.println("invalid");

        } if(name.contains("1")){
            System.out.println("invalid");

        } if(name.contains("2")){
            System.out.println("invalid");

        } if(name.contains("3")){
            System.out.println("invalid");

        } if(name.contains("4")){
            System.out.println("invalid");

        } if(name.contains("5")){
            System.out.println("invalid");

        } if(name.contains("6")){
            System.out.println("invalid");

        } if(name.contains("7")){
            System.out.println("invalid");

        } if(name.contains("8")){
            System.out.println("invalid");

        } if(name.contains("9")){
            System.out.println("invalid");

        }
        else {
            System.out.println(name.toUpperCase().trim());
        }

        return name;
    }


    /**
     * 3: Write a function that prints out every variable seen in the code. It should not return anything
     */
    private static void exercise3() {
        System.out.println("\nExercise 3:");

        double myLunchPrice = 5.99;
        String lunchType = "sandwich";
        String description = "Nice big sandwich";
        int weightInGrams = 500;
        String all= "Lunch type =" +lunchType+"\n Description ="+ description+"\n Weight in grams = "+weightInGrams;
        print(all);


    }
    private static void print(String pippo){
        System.out.println(pippo);
    }
}

