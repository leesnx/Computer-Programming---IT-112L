/*
 * Author: Bagsan, Lei Ceasar A.
 * Programming Date: 08/22/2022
 * Activity Name and Number: Prelims Exercise Number 2
 */

package Prelim.Exercises;

import java.lang.*; // import statement

public class Circle { // class declaration
    public static void main(String[] args) { // main method declaration
        double radius;
        double circumference;
        double areaOfCircle;

        radius = 10.0;
        circumference = 2 * Math.PI * radius;
        areaOfCircle = Math.PI * radius * radius;

        System.out.println("Radius: " + radius);
        System.out.println("Circumference: " + circumference);
        System.out.println("Area of Circle: " + areaOfCircle);
    } // end of main method
} // end of Circle class
