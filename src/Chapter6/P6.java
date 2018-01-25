package Chapter6;

import java.util.Scanner;

/**
 * Program to convert dollars to euros, pounds, or yen
 *
 * @author Vinayak Gopakumar
 */
public class P6 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many Euros are in a dollar?");
        double euros = input.nextDouble();

        System.out.println("How many Pounds are in a dollar?");
        double pounds = input.nextDouble();

        System.out.println("How many Yen are in a dollar?");
        double yen = input.nextDouble();

        String answer;
        do {
            System.out.println("Enter the number of dollars.");
            double dollars = input.nextDouble();

            System.out.println("Enter \"E\" to buy Euros, \"P\" to buy Pounds or \"Y\" to buy Yens");
            String currency_choice = input.next().toUpperCase();

            // Convert based on what choice someone has made eg E for Euros, P for poounds and Y for Yen
            switch (currency_choice) {
                case "E":
                    double euroBought = convert(dollars, euros);
                    System.out.printf("For %.2f dollars, you will get %.2f euros", dollars, euroBought);
                    break;

                case "P":
                    double poundBought = convert(dollars, pounds);
                    System.out.printf("For %.2f dollars, you will get %.2f Pound Sterlings", dollars, poundBought);
                    break;
                case "Y":
                    double yenBought = convert(dollars, yen);
                    System.out.printf("For %.2f dollars, you will get %.2f yen", dollars, yenBought);
                    break;
            }

            // Ask the user if they want to perform more conversions
            System.out.println("\nDo you want to perform more conversions?: ");
            answer = input.next().toLowerCase();
            while (!answer.equals("no") && !answer.equals("yes")) {
                System.out.println("Enter \"yes\" to continue or \"no\" to stop");
                answer = input.next().toLowerCase();
            }
        } while (!answer.equalsIgnoreCase("no")); //if the answer is not "no", redo what is in the loop
    }

    // Method to perform currency conversions
    /**
     * Convert Method
     *
     * @param dollars amount of dollars that are being converted
     * @param num2 currency dollars is converting to
     * @return how many of the currency is equal to the dollar amount
     */
    public static double convert(double dollars, double num2) {
        if (dollars > 100) {
            double newDollars = (dollars * 0.95);
            double newbought = (newDollars * num2);
            return newbought;

        } else {
            double newDollars = (dollars * 0.90);
            double newbought = (newDollars * num2);
            return newbought;
        }
    }
}
