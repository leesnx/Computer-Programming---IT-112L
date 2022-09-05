/*
 * Author: Bagsan, Lei Ceasar A.
 * Programming Date: 08/22/2022
 * Activity Name and Number: Prelims Exercise Number 2
 */

package Prelim.Exercises;

import java.lang.*; // import statement

public class Rectangle { // class declaration
    public static void main(String[] args) { // main method declaration
        double length;
        double width;
        double perimeter;
        double areaOfRectangle;

        length = 10;
        width = 6;
        perimeter = 2 * length + 2 * width;
        areaOfRectangle = length * width;

        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Area of Rectangle: " + areaOfRectangle);
    } // end of main method
} // end of Rectangle class
