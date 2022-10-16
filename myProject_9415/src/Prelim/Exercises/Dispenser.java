/*
 * Author: Bagsan, Lei Ceasar A.
 * Programming Date: 09/05/2022
 * Activity Name and Number: Prelims Exercise Number 7
 */

package Prelim.Exercises;

import java.lang.*; // import statement
import java.util.Scanner;

public class Dispenser { // class declaration
    public static void main(String[] args) { // main method declaration
        Scanner dmc = new Scanner(System.in); // setting up Scanner

        //amount input
        System.out.print("Enter amount to be withdrawn, whole numbers only: ");
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

    } // end of main method
} // end of Dispenser class
