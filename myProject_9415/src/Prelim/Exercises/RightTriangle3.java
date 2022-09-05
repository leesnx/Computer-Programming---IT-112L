/*
 * Author: Bagsan, Lei Ceasar A.
 * Programming Date: 08/22/2022
 * Activity Name and Number: Prelims Exercise Number 4
 */

package Prelim.Exercises;

import java.lang.*; // import statement
import java.util.Scanner;

public class RightTriangle3 { // class declaration
    public static void main(String[] args) { // main method declaration
        Scanner kbd = new Scanner(System.in); // setting up Scanner
        double hypotenuse, perimeter, areaOfRightTriangle;

        System.out.print("Enter the base value: ");
        int base = Integer.parseInt(kbd.nextLine());
        System.out.print("Enter the height value: ");
        int height = Integer.parseInt(kbd.nextLine());

        hypotenuse = Math.sqrt(base * base + height * height);
        perimeter = base + height + hypotenuse;
        areaOfRightTriangle = 0.5 * base * height;

        System.out.println("Base: " + base);
        System.out.println("Height: " + height);
        System.out.println("Hypotenuse: " + hypotenuse);
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Area of Right Triangle: " + areaOfRightTriangle);
    } // end of main method
} // end of RightTriangle3 class
