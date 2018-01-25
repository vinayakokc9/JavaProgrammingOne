package Chapter5;

import java.util.Scanner;

/**
 * Program to play rock, paper, scissor with user
 *
 * @author Vinayak Gopakumar
 */
public class C5_34 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int count_user = 0;

        int count_computer = 0;

        while (1 == 1) {
            if (count_user == 3) {
                System.out.println("The user wins.");
                break;
            }
            if (count_computer == 3) {
                System.out.println("The computer wins");
                break;
            }

            System.out.println("Choose rock (0), paper (1), or scissor (2).");
            int choice = input.nextInt();

            switch (choice) {
                case 0:
                    System.out.println("You are rock.");
                    break;
                case 1:
                    System.out.println("You are paper.");
                    break;
                case 2:
                    System.out.println("You are scissor.");
                    break;
            }

            if (choice < 3 && choice >= 0) {

                //computer choice
                int computer_choice = (int) (Math.random() * 3);
                if (computer_choice != choice) {
                    switch (computer_choice) {
                        case 0:
                            System.out.println("The computer is rock.");
                            break;
                        case 1:
                            System.out.println("The computer is paper.");
                            break;
                        case 2:
                            System.out.println("The computer is scissor.");
                            break;
                    }

//rock outcomes
                    if (choice == 1 && computer_choice == 0) {
                        System.out.println("You won.");
                        count_user++;
                    }
                    if (choice == 2 && computer_choice == 0) {
                        System.out.println("You lost.");
                        count_computer++;
                    }

//paper outcomes
                    if (choice == 2 && computer_choice == 1) {
                        System.out.println("You won.");
                        count_user++;
                    }
                    if (choice == 0 && computer_choice == 1) {
                        System.out.println("You lost.");
                        count_computer++;
                    }
//scissor outcomes
                    if (choice == 1 && computer_choice == 2) {
                        System.out.println("You lost.");
                        count_computer++;
                    }
                    if (choice == 0 && computer_choice == 2) {
                        System.out.println("You won.");
                        count_user++;
                    }
                }
//draws 
                if (choice == 0 && computer_choice == 0) {
                    System.out.println("The computer is also rock.");
                    System.out.println("It is a draw.");
                }
                if (choice == 1 && computer_choice == 1) {
                    System.out.println("The computer is also paper.");
                    System.out.println("It is a draw.");
                }
                if (choice == 2 && computer_choice == 2) {
                    System.out.println("The computer is also scissor.");
                    System.out.println("It is a draw.");
                }

            }
        }
    }
}
