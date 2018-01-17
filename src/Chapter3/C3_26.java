package Chapter3;

import java.util.Scanner;

/**
 * Program to display if a number given by the user is divisible by 5 and/or 6
 *
 * @author Vinayak Gopakumar
 */
public class C3_26 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Integer input
        System.out.println("Enter an integer");
        int x = input.nextInt();

        //and
        System.out.println("Is " + x + " divisible by 5 and 6? " + (x % 5 == 0 && x % 6 == 0));

        //or
        System.out.println("Is " + x + " divisible by 5 or 6? " + (x % 5 == 0 || x % 6 == 0));

        //not both
        System.out.println("Is " + x + " divisible by 5 or 6, but not both? " + (x % 5 == 0 ^ x % 6 == 0));

    }

}
