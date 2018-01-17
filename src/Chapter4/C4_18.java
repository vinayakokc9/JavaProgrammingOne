package Chapter4;

import java.util.Scanner;

/**
 * Program to display profession and grade with information given by the user
 *
 * @author Vinayak Gopakumar
 */
public class C4_18 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter two characters: ");
        String major_status = input.next().toUpperCase();
        String secondstring;
        char major = major_status.charAt(0);
        char status = major_status.charAt(1);

        switch (major) {
            case 'M':
                secondstring = "Mathematics";
                break;
            case 'C':
                secondstring = "Computer Science ";
                break;
            case 'I':
                secondstring = "Information Techonology ";
                break;
            default:
                secondstring = "Invalid input";

        }
        if (!(secondstring.equals("Invalid input"))) {

            switch (status) {
                case '1':
                    secondstring += "Freshman";
                    break;
                case '2':
                    secondstring += "Sophomore";
                    break;
                case '3':
                    secondstring += "Junior";
                    break;
                case '4':
                    secondstring += "Senior";
                    break;
                default:
                    secondstring = "Invalid input";
//output        
            }
        }
        System.out.println(secondstring);
    }

}
