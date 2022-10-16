/*
 * Author: Bagsan, Lei Ceasar A.
 * Programming Date: 09/12/2022
 * Class Code and Course Number: 9415A IT 112
 */

package prelim.activities;

import java.lang.*;
import java.util.*;

public class ProgramDemo {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
// get keyboard input for three integers
        System.out.print("First Number: ");
        int n1 = Integer.parseInt(keyboard.nextLine());
        System.out.print("Second Number: ");
        int n2 = Integer.parseInt(keyboard.nextLine());
        System.out.print("Third Number: ");
        int n3 = Integer.parseInt(keyboard.nextLine());
// display the three numbers
        System.out.println ("You entered the numbers " + n1 + ", " + n2 +

                " and " + n3);

// add the three numbers and store it in another int variable

// identified as sum
        int sum = n1 + n2 + n3;
// display the sum
        System.out.println("\nThe sum of the three numbers is " + sum);
// divide the first number by the second and display the value
        int q1 = n1/n2;
        System.out.println("\nThe expression used computed the integer " +
                "quotient : " + q1);
        double q2 = (double) n1/n2;
        System.out.println("\nThe expression used computed the actual " +
                "quotient: " + q2);

    /*#1. Compute the product of the three numbers, store it in another
    integer variable and display this value.

    INSERT THE CODES BELOW... */
        int product = n1*n2*n3;
        System.out.println("\nThe product of the three numbers is " + product);
    /* #2. Get the sum of the first two numbers and divide it by the third
    number, compute only for the integer quotient and display the value.
    INSERT THE CODES BELOW... */
        int iq1 = (n1+n2)/n3;
        System.out.println("\nThe integer quotient of the expression is " + iq1);
    /* #3. Get the sum of the first two numbers and divide it by the third
    number, compute for the exact quotient and display the value.
    INSERT THE CODES BELOW... */
        double iq2 = (double) (n1+n2)/n3;
        System.out.println("\nThe exact quotient of the expression is " + iq2);
    /* #4. Compute the average of the three numbers and display the value.
    INSERT CODE BELOW... */
        int ave = sum / 3;
        System.out.println("\nThe average of the three numbers is " + ave);
    /* #5. Compute the square of each number and display the results
    INSERT CODE BELOW... */
        int s1 = (int) Math.pow(n1,2);
        int s2 = (int) Math.pow(n2,2);
        int s3 = (int) Math.pow(n3,2);

        System.out.println("\nThe square of the first number is " + s1);
        System.out.println("\nThe square of the second number is " + s2);
        System.out.println("\nThe square of the third number is " + s3);
    } // End of the main method
} // End of class
