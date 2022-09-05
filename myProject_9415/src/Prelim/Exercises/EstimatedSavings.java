/*
 * Author: Bagsan, Lei Ceasar A.
 * Programming Date: 08/23/2022
 * Activity Name and Number: Optional Exercises 2
 */

package Prelim.Exercises;

import java.lang.*;
import java.util.Scanner;

public class EstimatedSavings {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("How much is your 6-day allowance? ");
        double allowance = Double.parseDouble(keyboard.nextLine());
        System.out.println("--------------------------------------------------------------------------------");
        System.out.print("How much is your daily budget for transportation? ");
        double fare = Double.parseDouble(keyboard.nextLine());
        System.out.print("How much is your daily budget for food? ");
        double food = Double.parseDouble(keyboard.nextLine());
        System.out.print("How much is your daily budget for personal hygiene? ");
        double hygiene = Double.parseDouble(keyboard.nextLine());
        System.out.print("How much is your daily budget for cell phone load? ");
        double load = Double.parseDouble(keyboard.nextLine());

        double oneDay = fare + food + hygiene + load;
        double oneWeek = oneDay * 6;
        double weekSavings = allowance - oneWeek;
        double semSavings = weekSavings * 16;
        double totalSavings = semSavings * 8;

        System.out.println("--------------------------------------------------------------------------------");
        System.out.printf("Expected Total Expenses for 6 days:                                      %.2f", oneWeek);
        System.out.printf("\nExpected Savings for 6 days:                                             %.2f", weekSavings);
        System.out.printf("\nExpected Savings for one semester:                                      %.2f", semSavings);
        System.out.printf("\nExpected Savings for eight semesters                                   %.2f", totalSavings);
        System.out.println("\n--------------------------------------------------------------------------------");
    }
}
