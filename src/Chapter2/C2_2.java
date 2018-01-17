package Chapter2;

import java.util.Scanner;

/**
 * Program to display area and volume using radius and length of user
 *
 * @author Vinayak Gopakumar
 */
public class C2_2 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius and length of a cylinder");
        double radius = input.nextDouble();

        double length = input.nextDouble();

        //Had wrong formula in the book
        double area = 2 * (Math.PI * radius * length) + 2 * (Math.PI * radius * radius);
        double volume = Math.PI * radius * radius * length;

        System.out.println("The area is " + (float) area);
        System.out.print("The volume is " + (float) volume);

    }

}
