package Chapter7;

import java.util.Scanner;

/**
 * Program to find minimum number of a list
 *
 * @author Vinayak Gopakumar
 */
public class C7_9 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] nums = new double[10];
        System.out.println("Enter ten numbers");
        //elements
        for (int i = 0; i < nums.length; i++) {
            nums[i] = input.nextDouble();
        }
        System.out.println("The minimum number is " + min(nums));

    }

    /**
     * min Method
     *
     * @param nums list of the numbers
     * @return the least in the list
     */
    public static double min(double[] nums) {
        double least = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (least > nums[i]) {
                least = nums[i];
            }
        }
        return least;
    }

}
