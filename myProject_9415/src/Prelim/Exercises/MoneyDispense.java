/*
 * Author: Bagsan, Lei Ceasar A.
 * Programming Date: 09/07/2022
 * Activity Name and Number: Prelims Exercise Number 7
 */

/*
 Problem: Write a program that will read the amount of money that will be withdrawn from an ATM (e.g. P500 or P1200)
then compute and output the least number of peso bills (P100 peso bills, P500 peso bills, P1000 peso bills) that
will be dispensed by the machine for the requested amount.
------------------------------------------------------------------------------------------------------------------------
 Input: Amount to be dispensed
 Process:
    1) take input of amount to be dispensed
    2) calculate and print minimum number of bills per denomination
    3) calculate and print the total amount for the quantity of the bill denomination
    4) calculate and print the total number of bills dispensed and total amount dispensed
 Output: Least number of bills that will be dispensed by the machine for the requested amount
 Algorithm:
    1) get amount input
    2) calculate bill count for each denomination
    3) calculate the bill amount for the quantity of each denomination
    4) calculate the total number of bills dispensed and the amount dispensed
*/

package Prelim.Exercises;

import java.lang.*; // import statement
import java.util.Scanner;

public class MoneyDispense { // class declaration
    public static void main(String[] args) { // main method declaration
        Scanner dmc = new Scanner(System.in); // setting up Scanner

        //amount input
        System.out.print("Enter amount to be withdrawn (Can only dispense in 1000, 500, and 100 bills): ");
        int amount = Integer.parseInt(dmc.nextLine());

        //bill counter
        int otb = amount / 1000;
        amount = amount % 1000;
        int fhb = amount / 500;
        amount = amount % 500;
        int ohb = amount / 100;

        //total bill amount
        double otbc = otb * 1000;
        double fhbc = fhb * 500;
        double ohbc = ohb * 100;

        //final bill count and amount
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
    } // end of main method
} // end of MoneyDispense class