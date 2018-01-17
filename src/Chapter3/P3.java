package Chapter3;

import java.util.Scanner;

/**
 * Program to display whether a number given by the user is greater than, less
 * than, or equal to another number, if the first
 * number/second number is a proper or improper fraction, the
 * first number's grade, if the second number is between 0 and
 * 100
 *
 * @author Vinayak Gopakumar
 */
public class P3 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is the first number?");
        double firstNumber = input.nextDouble();

        System.out.println("What is the second number?");
        double secondNumber = input.nextDouble();
        //less than or greater than
        if (firstNumber < secondNumber) {
            System.out.println("The first number is less than the second");
        } else if (firstNumber > secondNumber) {
            System.out.println("The first number is greater than the second");
        } //equal
        else if (firstNumber == secondNumber) {
            System.out.println("The first number is equal to the second");
        } else {
            System.out.println("The first number is not equal to the second");
        }

        if (firstNumber <= secondNumber) {
            System.out.println("The first number is less than or equal to the second");
        }

        if (firstNumber != secondNumber) {
            System.out.println("The first number is not equal to the second");
        }

        if (secondNumber == 0) {
            System.out.println("Cannot divide by zero");
        } else if (firstNumber / secondNumber <= 1) {
            System.out.println("proper fraction");
        } else {
            System.out.println("improper fraction");
        }

        if (firstNumber >= 90) {
            System.out.println("A");
        } else if (firstNumber >= 80) {
            System.out.println("B");
        } else if (firstNumber >= 70) {
            System.out.println("C");
        } else if (firstNumber >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }

        if (secondNumber >= 1 && secondNumber <= 100) {
            System.out.println("In range");
        } else {
            System.out.println("Out of range");
        }

    }
}
