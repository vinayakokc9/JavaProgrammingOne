package Chapter4;

import java.util.Scanner;

/**
 * Program to display employee name, hours worked, pay rate, gross rate,
 * deductions, total deductions, and net pay
 *
 * @author Vinayak Gopakumar
 */
public class C4_23 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter employee's name: ");
        String employee = input.next();
        System.out.println("Enter number of hours worked in a week: ");
        double hours = input.nextDouble();
        System.out.println("Enter hourly pay rate: ");
        double pay_rate = input.nextDouble();
        double pay_rateperc = (pay_rate * 100);
        System.out.println("Enter federal tax withholding rate: ");
        double fed_rate = input.nextDouble();
        double fed_rateperc = (fed_rate * 100);
        System.out.println("Enter state tax withholding rate: ");
        double state_rate = input.nextDouble();
        double state_rateperc = (state_rate * 100);
//gross pay
        double gross_pay = (hours * pay_rate);
        double fed_with = (gross_pay * fed_rate);

        double state_with = (gross_pay * state_rate);
        double total_deduction = (fed_with + state_with);
        double net_pay = (gross_pay - total_deduction);
//outputs
        System.out.printf("\n Employee Name: %s", employee);
        System.out.printf("\n Hours Worked: %4.2f", hours);
        System.out.printf("\n Pay Rate: $%4.2f", pay_rate);
        System.out.printf("\n Gross pay: $%4.2f", gross_pay);
        System.out.printf("\n Deductions:" + "\n Federal Withholding:(%.1f%%): $%.2f", fed_rateperc,
                fed_with);
        System.out.printf("\n State Withholding:(%.1f%%): $%.2f", state_rateperc, state_with);
        System.out.printf("\n Total Deduction: $%.2f", total_deduction);
        System.out.printf("\n Net pay: $%4.2f", net_pay);
    }
}
