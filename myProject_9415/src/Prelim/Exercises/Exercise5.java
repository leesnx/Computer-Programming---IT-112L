/*
 * Author: Bagsan, Lei Ceasar A.
 * Programming Date: 08/31/2022
 * Activity Name and Number: Prelims Exercise Number 5
 */

package Prelim.Exercises;

import java.lang.*; // import statement
import java.util.Scanner;

public class Exercise5 { // class declaration
    public static void main(String[] args) { // main method declaration
        Scanner keyboard = new Scanner(System.in); // setting up Scanner

        System.out.print("First Number: ");
        int n1 = Integer.parseInt(keyboard.nextLine());
        System.out.print("Second Number: ");
        int n2 = Integer.parseInt(keyboard.nextLine());
        System.out.print("Third Number: ");
        int n3 = Integer.parseInt(keyboard.nextLine());

        System.out.println("\nYou entered the numbers " + n1 + ", " + n2 + " and " + n3);

        /* #1. Compute the product of the three numbers, store it in another integer
            variable and display this value. INSERT THE CODES BELOW... */
        int sum = n1 + n2 + n3;

        System.out.println("\nThe sum of the three numbers is " + sum);

        int q1 = n1 / n2;

        System.out.println("\nThe expression used computed the integer quotient: " + q1);

        double q2 = (double) n1 / n2;

        System.out.println("\nThe expression used computed the actual quotient: " + q2);

        int product = n1 * n2 * n3;

        System.out.println("\nThe product of the three numbers is " + product);

        /* #2. Get the sum of the first two numbers and divide it by the third number,
            compute only for the integer quotient and display the value.
            INSERT THE CODES BELOW... */
        int q3 = (n1 + n2) / n3;

        System.out.println("\nThe expression used computed the integer quotient: " + q3);

        /* #3. Get the sum of the first two numbers and divide it by the third number,
            compute for the exact quotient and display the value.
            INSERT THE CODES BELOW... */
        double q4 = (double) (n1 + n2) / n3;

        System.out.println("\nThe expression used computed the actual quotient: " + q4);

        /* #4. Compute the average of the three numbers and display the result with 2
            decimal values shown. INSERT CODE BELOW... */
        double average = (double) sum / 3;

        System.out.printf("\nThe average of the three numbers is %.2f",average);

        /* #5. Compute the square of each number and display the results.
            INSERT CODE BELOW... */
        int n1s = n1 * n1;
        int n2s = n2 * n2;
        int n3s = n3 * n3;

        System.out.println("\n\nThe square of the first number is " + n1s);
        System.out.println("The square of the second number is " + n2s);
        System.out.println("The square of the third number is " + n3s);
    } // end of main method
} // end of Exercise5 class
