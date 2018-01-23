package Chapter7;

import java.util.Scanner;

/**
 * Program to show average of a list
 *
 * @author Vinayak Gopakumar
 */
public class P7 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many numbers will be read?");

        double[] list = new double[input.nextInt()];
        System.out.println("Enter " + list.length + " elements");
        m(list);
        average(list);
        System.out.println("The average is " + average(list));
        print(list);
    }

    /**
     * m Method
     *
     * @param list assigns a number to each index
     */
    public static void m(double[] list) {
        //putting the numbers into the array
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextDouble();
        }
    }

    /**
     * average Method
     *
     * @param list gets average of the numbers in the list
     * @return returns the total
     */
    public static double average(double[] list) {
        //getting average
        double sum = 0.0;
        for (int i = 0; i < list.length; i++) {
            sum += list[i];
        }
        double total = (sum / list.length);
        return total;
    }

    /**
     * print Method
     *
     * @param list prints the commas in the list and the numbers
     */
    public static void print(double[] list) {
        //printing array numbers
        System.out.print("[" + list[0] + ", ");
        for (int i = 1; i < (list.length - 2); i++) {
            System.out.print(list[i] + ", ");
        }

        System.out.print(list[3] + ", ");
        System.out.print(list[list.length - 1] + "]");
    }
}
