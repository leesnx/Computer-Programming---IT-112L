/*
 * Author: Bagsan, Lei Ceasar A.
 * Programming Date: 08/22/2022
 * Activity Name and Number: Prelims Exercise Number 7
 */

package prelim.exercises;

import java.lang.*; // import statement
import java.util.Scanner;

public class Dispenser { // class declaration
    public static void main(String[] args) { // main method declaration
        Scanner dmc = new Scanner(System.in); // setting up Scanner

        System.out.print("Enter amount to be withdrawn, whole numbers only: ");
        int amount = Integer.parseInt(dmc.nextLine());

        int otb = 0;
        int fhb = 0;
        int ohb = 0;
        double otbc = 0;
        double fhbc = 0;
        double ohbc = 0;

        while (amount > 1000){
            otb++;
            otbc = otbc + 1000;
            amount = amount - 1000;
        }
        while (amount >= 500 && amount <= 1000){
            fhb++;
            fhbc = fhbc + 500;
            amount = amount - 500;
        }
        while (amount >= 100 && amount < 500) {
            ohb++;
            ohbc = ohbc + 100;
            amount = amount - 100;
        }
        int bc = otb + fhb + ohb;
        double at = otbc + fhbc + ohbc;

        System.out.println("PESO BILLS          QUANTITY          AMOUNT");
        System.out.println("==========         =========         =======");
        System.out.printf("P1000                     " + otb + "          %.2f", otbc);
        System.out.printf("\nP500                      " + fhb + "           %.2f", fhbc);
        System.out.printf("\nP100                      " + ohb + "           %.2f", ohbc);
        System.out.println("\n----------         ---------         -------");
        System.out.printf("Total No. Of Bills        " + bc + "          %.2f", at);
    } // end of main method
} // end of Dispenser class
