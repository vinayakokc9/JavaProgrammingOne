package Chapter6;

import java.util.Scanner;

/**
 * Program to check if password is valid or not
 *
 * @author Vinayak Gopakumar
 */
public class C6_18 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a password");
        String password = input.next();

        // Check to see if password is valid or not
        if (isValid(password)) {
            System.out.println("Valid password");
        } else {
            System.out.println("Invalid password");
        }
    }
/**
     * IsValid Method
     *
     * @param p the password
     * @return tells if password is valid or not using boolean
     */
    public static boolean isValid(String p) {

// Must have 8 characters
        if (p.length() < 8) {
            System.out.println("A password must have at least 8 characters");
            return false;
        }

        // Consists of only letters and digits
        for (int i = 0; i < p.length(); i++) {
            if (!(Character.isLetterOrDigit(p.charAt(i)))) {
                System.out.println("A password must consist of only letters and digits");
                return false;
            }
        }
        //at least two digits 
        int counter = 0;
        for (int i = 0; i < p.length(); i++) {
            if (Character.isDigit(p.charAt(i))) {
                ++counter;
            }
        }

        if (counter < 2) {
            System.out.println("A password must have at least two digits");
            return false;
        }

        return true;

    }

}
