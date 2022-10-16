/*
 * Author: Bagsan, Lei Ceasar A.
 * Programming Date: 09/07/2022
 * Class Code and Course Number: 9415A IT 112
 */

/*
 Problem:
 Create a program that will read the amount of money that will be withdrawn from an ATM (e.g.
P500 or P1200) then compute and output the least number of peso bills (P100 peso bills, P500
peso bills, P1000 peso bills) that will be dispensed by the machine for the requested amount.
Determine also the amount of money corresponding to each peso bill dispensed, the sum total of
number of bills dispensed, and sum total of amounts per denomination as shown below. Assume
that enough bills are always available from the machine. Assume further that the machine can
only dispense P100 peso bills, P500 peso bills, and P1000 peso bills. Validate the input amount
such that it should be divisible by 100.
------------------------------------------------------------------------------------------------------------------------
 Input: amount to dispense
 Process:
 read the amount
 divide amount by 1000
 divide remainder amount by 500
 divide remainder amount by 100
 Output: least number of bills that will be dispensed by the machine for the requested amount
 Algorithm:
    Let amount represent amount to dispense
    Divide amount by 1000
    Divide remainder amount by 500
    Divide remainder amount by 100
    Count the total number of bills
    Calculate the total amount dispensed
    Print Values
*/

package prelim.activities;

import java.lang.*;
import java.util.Scanner;

public class MoneyDispenser {
    public static void main(String[] args) {
        Scanner dmc = new Scanner(System.in);

        System.out.print("Enter amount to be withdrawn (Can only dispense in 1000, 500, and 100 bills): ");
        int amount = Integer.parseInt(dmc.nextLine());

        int otb = amount / 1000;
        amount = amount % 1000;
        int fhb = amount / 500;
        amount = amount % 500;
        int ohb = amount / 100;

        double otbc = otb * 1000;
        double fhbc = fhb * 500;
        double ohbc = ohb * 100;

        int bc = otb + fhb + ohb;
        double bt = otbc + fhbc + ohbc;

        System.out.println("------------------------------");
        System.out.printf("%s%10s%10s%n","PESO BILLS","QUANTITY","AMOUNT");
        System.out.printf("%s%13d%10.2f%n","1000.00",otb,otbc);
        System.out.printf("%s%14d%10.2f%n","500.00",fhb,fhbc);
        System.out.printf("%s%14d%10.2f%n","100.00",ohb,ohbc);
        System.out.println("------------------------------");
        System.out.printf("%s%2d%10.2f%n","Total No. of Bills",bc,bt);
        System.out.println("------------------------------");

        System.exit(0);
    }
}