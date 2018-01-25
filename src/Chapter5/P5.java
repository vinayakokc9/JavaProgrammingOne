package Chapter5;

import java.util.Scanner;

/**
 * Program to count votes
 *
 * @author Vinayak Gopakumar
 */
public class P5 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int yes_voten = 0;
        int no_voten = 0;
        int invalid_voten = 0;

        while (true) {
            System.out.println("Enter 'Y' to vote yes, 'N' to vote no, or 'Q' to quit voting");
//charAt0 for vote input
            char vote = input.next().charAt(0);
            if (vote == 'Q' || vote == 'q') {
                int total_voten = (yes_voten + no_voten + invalid_voten);
                System.out.printf("\nYes votes: %d\nNo votes: %d\nInvalid notes: %d\nTotal votes: %d", yes_voten, no_voten, invalid_voten, total_voten);
                break;
            }

            switch (vote) {
                case 'Y':
                    yes_voten++;
                    break;
                case 'y':
                    yes_voten++;
                    break;
                case 'N':
                    no_voten++;
                    break;
                case 'n':
                    no_voten++;
                    break;
                default:
                    System.out.println("INVALID INPUT");
                    invalid_voten++;
                    break;

            }

        }
    }
}
