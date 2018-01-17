package Chapter4;

import java.util.Scanner;

/**
 * Program to display which of two bidders will win and the total number of
 * dollars one can get from the winner
 *
 * @author Vinayak Gopakumar
 */
public class P4 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//first bidder
        System.out.println("What is the name of the first bidder?");
        String first_bidder = input.next();
        System.out.println("How many of hours of work will the first bidder require?");
        int first_hour = input.nextInt();
        System.out.println("How much does the first bidder charge per hour in dollars?");
        double first_charge = input.nextDouble();

//second bidder
        System.out.println("What is the name of the second bidder");
        String second_bidder = input.next();

        System.out.println("How many hours of work will the second bidder require?");
        int second_hour = input.nextInt();
        System.out.println("How much does the second bidder charge per hour in dollars?");

        Double second_charge = input.nextDouble();

//cost
        double first_cost = (first_charge * first_hour);
        double second_cost = (second_charge * second_hour);

        if (first_cost < second_cost) {
            System.out.printf("The winner is %s.", first_bidder);
            System.out.printf("\n The total cost in dollars is: $%.2f.", first_cost);
        } else if (second_cost < first_cost) {

            System.out.printf("The winner is %s.", second_bidder);
            System.out.printf("\nThe total cost in dollars is: $%.2f.", second_cost);
        } else if (first_cost == second_cost && first_hour < second_hour) {
            System.out.printf("The winner is %s.", first_bidder);
            System.out.printf("\nThe total cost in dollars is $%.2f.", first_cost);
            System.out.printf("\nThe number of hours for the first bidder is %d", first_hour);

        } else if (first_cost == second_cost && second_hour < first_hour) {
            System.out.printf("The winner is %s.", second_bidder);
            System.out.printf("\nThe total cost in dollars is $%.2f", second_cost);
            System.out.printf("\nThe number of hours for the second bidder is %d", second_hour);
        } else if (first_cost == second_cost && first_hour == second_hour) {
            System.out.printf("Both %s and %s have identical bids.", first_bidder, second_bidder);
            System.out.printf("\nThe number of hours: \n%s = %d %s =  %d", first_bidder, first_hour, second_bidder, second_hour);
            System.out.printf("\nThe cost per hour in dollars:\n%s = $%.2f   %s = $%.2f", first_bidder, first_charge, second_bidder, second_charge);
            System.out.printf("\nThe total cost in dollars: \n%s = %.2f %s = $%.2f", first_bidder, first_cost, second_bidder, second_cost);
        }
    }
}
