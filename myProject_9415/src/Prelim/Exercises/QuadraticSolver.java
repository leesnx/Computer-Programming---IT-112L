/*
 * Author: Bagsan, Lei Ceasar A.
 * Programming Date: 08/22/2022
 * Activity Name and Number: Prelims Exercise Number 8
 */

package Prelim.Exercises;

import java.util.Scanner;
import java.lang.*;

public class QuadraticSolver {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        double a, b, c;
        double root1, root2;

        System.out.println("This program determines the roots of a quadratic equation" +
                "\nof the form ax^2 +bx +c = 0.");
        System.out.print("Enter the coefficient of x^2 (a): ");
            a = Integer.parseInt(keyboard.nextLine());
        System.out.print("Enter the coefficient of x (b): ");
            b = Integer.parseInt(keyboard.nextLine());
        System.out.print("Enter the constant (c): ");
            c = Integer.parseInt(keyboard.nextLine());
        root1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        root2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        System.out.printf("\nThe roots of %c%.0f%s%.0f%s%.0f%s%.2f%s%.2f%c%n", '(', a, ")x^2 + (",
                b, ")x + (", c, ") = 0 are ", root1, " and ", root2, '.');
        System.exit(0);
    }
}
