/*
* Author: Bagsan, Lei Ceasar A.
* Programming Date: 08/23/2022
* Activity Name and Number: Optional Exercises 1
*/

package Prelim.Exercises;

import java.lang.*;
import java.util.Scanner;

public class EstimatedEducationalExpense {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("How much is your estimated tuition fee for one semester? ");
        double tuition = Double.parseDouble(keyboard.nextLine());
        System.out.print("Approximately, how much does your board and lodging for one-month cost? ");
        int lodging = Integer.parseInt(keyboard.nextLine());
        System.out.print("How much is your estimated living allowance for one month? ");
        int allowance = Integer.parseInt(keyboard.nextLine());

        double boardAndLodging = lodging * 5;
        double livingAllowance = allowance * 5;
        double oneSem = tuition + boardAndLodging + livingAllowance;
        double oneSummer = oneSem * 0.35;
        double wholeDuration = oneSem * 8 + oneSummer * 3;

        System.out.println("--------------------------------------------------------------------------------");
        System.out.printf("Estimated Tuition Fee per Semester                                      %.2f", tuition);
        System.out.printf("\nEstimated Board and Lodging cost per Semester                           %.2f", boardAndLodging);
        System.out.printf("\nEstimated Living Allowance per Semester                                 %.2f", livingAllowance);
        System.out.println("\n--------------------------------------------------------------------------------");
        System.out.printf("Estimated Amount Needed by a Student for one Semester                   %.2f", oneSem);
        System.out.printf("\nEstimated Amount Needed by a Student for one Short term                 %.2f", oneSummer);
        System.out.printf("\nEstimated Amount Needed by a Student to graduate                       %.2f", wholeDuration);
    }
}
