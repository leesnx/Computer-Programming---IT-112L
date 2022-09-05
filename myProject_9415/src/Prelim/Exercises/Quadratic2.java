/*
 * Author: Bagsan, Lei Ceasar A.
 * Programming Date: 08/23/2022
 * Activity Name and Number: Optional Exercises 3
 */

package Prelim.Exercises;

import java.lang.*;
import java.util.Scanner;

public class Quadratic2 {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        double a, b, c;
        double root1, root2;

        System.out.println("This program determines the roots of a quadratic " + "equation of the form ax^2 +bx +c = 0.");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.print("Enter the coefficient of x^2, a= ");
        a = Double.parseDouble(keyboard.nextLine());
        System.out.print("Enter the coefficient of x, b= ");
        b = Double.parseDouble(keyboard.nextLine());
        System.out.print("Enter the constant, c= ");
        c = Double.parseDouble(keyboard.nextLine());
        System.out.println("--------------------------------------------------------------------------------");

        double expression = b * b - 4 * a * c;

        if (expression >= 0) { // missing Boolean Expression
            root1 = (-b + Math.sqrt(expression))/(2 * a);
            root2 = (-b - Math.sqrt(expression))/(2 * a);
            System.out.printf("The roots of %c%.2f%s%.2f%s%.2f%s%.2f%s%.2f%c%n", '(', a, ")x^2 + (", b, ")x + (", c, ") = 0 are ", root1, " and ", root2, '.');
        }
        if (expression < 0) { // missing Boolean expression
            System.out.print("The roots of ");
            System.out.printf("%s%.2f%s%.2f%s%.2f%s", "(", a, ")x^2 + (", b, ")x + (", c, ") = 0");
            System.out.println(" are imaginary."); // roots are imaginary
        }
        System.exit(0);
    }
}
