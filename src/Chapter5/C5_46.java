/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter5;

import java.util.Scanner;

/**
 * Program to reverse a string
 *
 * @author Vinayak Gopakumar
 */
public class C5_46 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
//use line to show second word
        String s = input.nextLine();

        System.out.println("The reversed string is " + (new StringBuffer(s).reverse().toString()));
    }
}
