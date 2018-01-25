package Chapter8;

import java.util.Scanner;

/**
 * Program to print array of daily salesman sales
 *
 * @author Vinayak Gopaakumar
 */
public class P8 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] sale = new double[4][5];
        String Salesmen[] = {"A", "B", "C", "D"};
        String squestion;
        String man;
        String sday;
        double number;
        do {
            //id
            System.out.println("Enter the salesman ID as A, B, C, or D: ");
            man = input.next().toUpperCase();
            if (!man.equals("A") && !man.equals("B") && !man.equals("C") && !man.equals("D")) {
                do {
                    System.out.println("Invalid input");
                    System.out.println("Enter the salesman ID as A, B, C, or D: ");
                    man = input.next().toUpperCase();
                } while (!man.equals("A") && !man.equals("B") && !man.equals("C") && !man.equals("D"));
            }
            //day
            System.out.println("Enter the day as M, T, W, H, or F");
            sday = input.next().toUpperCase();
            if (!sday.equals("M") && !sday.equals("T") && !sday.equals("W") && !sday.equals("H") && !sday.equals("F")) {
                do {
                    System.out.println("Invalid input");
                    System.out.println("Enter the day as M, T, W, H, F");
                    sday = input.next().toUpperCase();
                } while (!sday.equals("M") && !sday.equals("T") && !sday.equals("W") && !sday.equals("H") && !sday.equals("F"));
            }
            //amount
            System.out.println("Enter the amount of sale");
            number = input.nextDouble();

            switch (man) {
                case "A":
                    switch (sday) {
                        case "M":
                            sale[0][0] = (number + sale[0][0]);
                            break;
                        case "T":
                            sale[0][1] = (number + sale[0][1]);
                            break;
                        case "W":
                            sale[0][2] = (number + sale[0][2]);
                            break;
                        case "H":
                            sale[0][3] = (number + sale[0][3]);
                            break;
                        case "F":
                            sale[0][4] = (number + sale[0][4]);
                            break;

                    }
                    break;
                case "B":
                    switch (sday) {
                        case "M":
                            sale[1][0] = (number + sale[1][0]);
                            break;
                        case "T":
                            sale[1][1] = (number + sale[1][1]);
                            break;
                        case "W":
                            sale[1][2] = (number + sale[1][2]);
                            break;
                        case "H":
                            sale[1][3] = (number + sale[1][3]);
                            break;
                        case "F":
                            sale[1][4] = (number + sale[1][4]);
                            break;

                    }
                    break;
                case "C":
                    switch (sday) {
                        case "M":
                            sale[2][0] = (number + sale[2][0]);
                            break;
                        case "T":
                            sale[2][1] = (number + sale[2][1]);
                            break;
                        case "W":
                            sale[2][2] = (number + sale[2][2]);
                            break;
                        case "H":
                            sale[2][3] = (number + sale[2][3]);
                            break;
                        case "F":
                            sale[2][4] = (number + sale[2][4]);
                            break;

                    }
                    break;
                case "D":
                    switch (sday) {
                        case "M":
                            sale[3][0] = (number + sale[3][0]);
                            break;
                        case "T":
                            sale[3][1] = (number + sale[3][1]);
                            break;
                        case "W":
                            sale[3][2] = (number + sale[3][2]);
                            break;
                        case "H":
                            sale[3][3] = (number + sale[3][3]);
                            break;
                        case "F":
                            sale[3][4] = (number + sale[3][4]);
                            break;

                    }
                    break;
            }
            System.out.println("More data? Enter Y for more or N to stop.");
            squestion = input.next().toUpperCase();
            if (!squestion.equals("Y") && !squestion.equals("N")) {
                do {
                    System.out.println("Invalid input");
                    System.out.println("More data? Enter Y for more or N to stop");
                    squestion = input.next().toUpperCase();
                } while (!squestion.equals("N") && !squestion.equals("Y"));
            }
            //      question = squestion.charAt(0);

        } while (!squestion.equals("N"));
        System.out.println("Salesman   M    T     W      H    F");

        for (int row = 0; row < sale.length; row++) {
            System.out.print("  " + Salesmen[row] + "\t  ");
            for (int column = 0; column < sale[row].length; column++) {
                System.out.print(sale[row][column] + "   ");
            }
            System.out.println();
        }
    }
}
