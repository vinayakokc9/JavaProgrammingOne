package Chapter4;

import java.util.Scanner;

/**
 * Program to display if a string is a substring of another string
 *
 * @author Vinayak Gopakumar
 */
public class C4_22 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//s1
        System.out.print("Enter string s1: ");
        String s1 = input.next();
//s2
        System.out.print("Enter string s2: ");
        String s2 = input.next();
        if (s1.contains(s2)) {
            System.out.print(s2 + " is a substring of " + s1);
        } else {
            System.out.print(s2 + " is not a substsring of " + s1);
        }
    }
}
