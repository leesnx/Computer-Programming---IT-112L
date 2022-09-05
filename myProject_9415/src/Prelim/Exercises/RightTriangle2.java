/*
 * Author: Bagsan, Lei Ceasar A.
 * Programming Date: 08/22/2022
 * Activity Name and Number: Prelims Exercise Number 3
 */

package prelim.exercises;

import java.lang.*; // import statement

public class RightTriangle2 { // class declaration
    public static void main(String[] args) { // main method declaration
        double base;
        double height;
        double hypotenuse;
        double perimeter;
        double areaOfRightTriangle;
        double a, b;

        base = 2.0;
        height = 3.0;
        a = base;
        b = height;
        hypotenuse = Math.sqrt(a * a + b * b);

        perimeter = base + height + hypotenuse;
        areaOfRightTriangle = 0.5 * base * height;

        System.out.println("Base: " + base);
        System.out.println("Height: " + height);
        System.out.println("Hypotenuse: " + hypotenuse);
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Area of Right Triangle: " + areaOfRightTriangle);
    } // end of main method
} // end of RightTriangle2 class
