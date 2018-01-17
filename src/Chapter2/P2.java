package Chapter2;

import java.util.Scanner;

/**
 * Program to display price of food, tip, tax, and total costs by the prices
 * given by the user
 *
 * @author Vinayak Gopakumar
 */
public class P2 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("What is the price of the meal?");
        float mealp = input.nextFloat();

        System.out.print("What is the price of the drink?");
        float drinkp = input.nextFloat();

        System.out.print("What is the price of the dessert?");
        float dessertp = input.nextFloat();

        float pof = mealp + drinkp + dessertp;

        double tax = pof * 0.10;

        double tip = (tax + pof) * 0.15;

        double totalc = pof + tax + tip;

        System.out.println("The price of food is $" + pof);
        System.out.println("The tip is $" + (float) tip);
        System.out.println("The tax is $" + tax);
        System.out.println("The total cost is $" + totalc);

    }
}
