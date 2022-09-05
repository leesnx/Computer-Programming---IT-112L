/*
 * Author: Bagsan, Lei Ceasar A.
 * Programming Date: 08/22/2022
 * Activity Name and Number: Prelims Exercise Number 4
 */

package prelim.exercises;

import java.lang.*; // import statement
import java.util.Scanner;

public class Rectangle3 { // class declaration
    public static void main(String[] args) { // main method declaration
        Scanner kbd = new Scanner(System.in); // setting up Scanner

        int length, width;
        double perimeter;
        double areaOfRectangle;

        System.out.print("Type the value of length then press the enter key: ");
        length = Integer.parseInt(kbd.nextLine());
        System.out.print("Type the value of width then press the enter key: ");
        width = Integer.parseInt(kbd.nextLine());

        perimeter = 2 * length + 2 * width;
        areaOfRectangle = length * width;

        System.out.println("Length of the rectangle is: " + length);
        System.out.println("Width of rectangle is: " + width);
        System.out.println("Perimeter of the rectangle is: " + perimeter);
        System.out.println("Area of the rectangle is: " + areaOfRectangle);
    } // end of main method
} // end of Rectangle3 class
