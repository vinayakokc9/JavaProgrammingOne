package Chapter2;

import java.util.Scanner;

/**
 * Program to display gratuity and total from a subtotal and a gratuity rate
 * given by the user
 *
 * @author Vinayak Gopakumar
 */
public class C2_5 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the subtotal and a gratuity rate");

        double subtotal = input.nextDouble();
        double gratuity = input.nextDouble();

        double gratuityt = gratuity / 100 * subtotal;

        double total = subtotal + gratuityt;

        System.out.print("The gratuity is $" + gratuityt + " and total is $" + total);

    }

}
