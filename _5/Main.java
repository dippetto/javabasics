package javabasics._5;

public class Main {
    // Don't forget to use comments to clear things up if you need them!
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4Bonus();
        exercise5Bonus();
        playAroundWithModulus();
    }

    /*
            Remember the symbols you need to do maths are

            Plus = +
            Minus = -
            Multiply or times = *
            Divide = /
     */

    /**
     * 1: Create an int variable, add 1 to the value and then print it. Use the + operator
     * Then minus 1 from the same variable and print it.
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");
        int number=20;
        number= number+1;
        System.out.println(number);
    }

    /**
     * 2: Create a double variable, times by 2 and then print it.
     * <p>
     * Create another double variable, which is the previous variable divided by 2
     * and then print it
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");
        double number=12.22;
        System.out.println("The initial double type number is="+number);
        number= number*2;
        System.out.println("The number times two is="+number);
        double dividedNumber= number/2;
        System.out.println("The number divided by two is="+dividedNumber);

    }

    /**
     * 3: We are going to convert the temperature from celsius to fahrenheit
     * <p>
     * Create a double variable called celsius
     * <p>
     * Create a new variable called fahrenheit
     * <p>
     * The variable fahrenheit should be set as
     * celsius times by 1.8 plus 32
     * <p>
     * Print out celsius and fahrenheit with 2 print statements
     */
    private static void exercise3() {
        System.out.println("\nExercise 3:");
        double celsius=10;
        double fahrenheit=(celsius*1.8)+32;
        System.out.println("Celsius is="+celsius);
        System.out.println("Fahrenheit is="+fahrenheit);
    }

    /**
     * 4: BONUS! This is an optional task, but it is recommended you complete it
     * ----------------------------------------------------------------------
     * Create an int called age with a starting value of 10.
     * <p>
     * Only using the '++' operator increase this value to 15
     */
    private static void exercise4Bonus() {
        System.out.println("\nExercise 4:");
        //Printing numbers from 10 to 15 using a for
        for(int i=10;i<=15;i++){
            System.out.println("i="+i);
        }
        System.out.println("Eheh");
        //The exercise wants to be done that way, using 5 lines of code
        int number=10;
        number++;
        number++;
        number++;
        number++;
        number++;
        System.out.println(number);
    }

    /**
     * 5: BONUS! This is an optional task, but it is recommended you complete it
     * ----------------------------------------------------------------------
     * Create an int called age set as 50
     * <p>
     * Using the -= operator change this value from 50 to 0 in one line of code,
     * <p>
     * Underneath create another int called secondAge set as 50
     * <p>
     * Change this value from 50 to 0 in 3 lines of code
     */
    private static void exercise5Bonus() {
        System.out.println("\nExercise 5:");
       int age=50;
       //Decreasing 50 to 0 in 1 line of code
       age -=50;
       int secondAge=50;
       //Decreasing 50 to 0 in 3 lines of code
       secondAge-=10;
       secondAge-=10;
       secondAge-=30;
        System.out.println(age);
        System.out.println(secondAge);

    }

    /**
     * This is completely optional, but if you guys want to play around with
     * modulus to get a better understanding. Simply change the code below
     */
    private static void playAroundWithModulus() {
        System.out.println("\nModulus testing!:");

        int value = 10;   // <--- change this value
        int modulus = 4; // <--- and this value to see the results of modulus


        System.out.println("Modulus calculation, " + value + " % " + modulus +
                "=" + value % modulus);

    }

}
