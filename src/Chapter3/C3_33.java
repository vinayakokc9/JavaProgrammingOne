package Chapter3;

import java.util.Scanner;

/**
 * Program to display which of the two packages has a better price
 *
 * @author Vinayak Gopakumar
 */
public class C3_33 {
/**
     * Main Method
     *
     * @param args arguments from command line prompt
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight and price for package 1: ");
        double firstWeight = input.nextDouble();
        double firstPrice = input.nextDouble();

        double firstRatio = firstPrice / firstWeight;

        System.out.print("Enter weight and price for package 2: ");
        double secondWeight = input.nextDouble();
        double secondPrice = input.nextDouble();

        double secondRatio = secondPrice / secondWeight;
        //comparison
        if (firstRatio < secondRatio) {
            System.out.println("Package 1 has a better price.");
        } else if (firstRatio == secondRatio) {
            System.out.println("Two packages have the same price.");
        } else {
            System.out.println("Package 2 has a better price");
        }

    }

}
