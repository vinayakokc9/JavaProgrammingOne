package Chapter7;

import java.util.Scanner;

/**
 * Program to show grades of students
 *
 * @author VinayakGopakumar
 */
public class C7_1 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the total number of students: ");
        int total_students = input.nextInt();

        int[] numscore = new int[total_students];

        System.out.println("Enter " + numscore.length + " grades: ");
        for (int i = 0; i < total_students; i++) {
            numscore[i] = input.nextInt();
        }

        int best = numscore[0];
        for (int i = 0; i < numscore.length; i++) {
            if (numscore[i] > best) {
                best = numscore[i];
            }
        }
        //outputs
        for (int i = 0; i < numscore.length; i++) {
            if (numscore[i] >= (best - 10)) {
                System.out.println("Student " + i + " score is " + numscore[i] + " and grade is A");
            } else if (numscore[i] >= (best - 20)) {
                System.out.println("Student " + i + " score is " + numscore[i] + " and grade is B");
            } else if (numscore[i] >= (best - 30)) {
                System.out.println("Student " + i + " score is " + numscore[i] + " and grade is C");
            } else if (numscore[i] >= (best - 40)) {
                System.out.println("Student " + i + " score is " + numscore[i] + " and grade is D");
            } else {
                System.out.println("Student " + i + " score is " + numscore[i] + " and grade is F");
            }
        }
    }
}
