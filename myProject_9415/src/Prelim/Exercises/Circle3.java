/*
 * Author: Bagsan, Lei Ceasar A.
 * Programming Date: 08/22/2022
 * Activity Name and Number: Prelims Exercise Number 4
 */

package prelim.exercises;

import java.lang.*; // import statement
import java.util.Scanner;

public class Circle3 { // class declaration
    public static void main(String[] args) { // main method declaration
        Scanner kbd = new Scanner(System.in); // setting up Scanner

        int radius;
        double circumference;
        double areaOfCircle;

        System.out.print("Type the value of radius then press the enter key: ");
        radius = Integer.parseInt(kbd.nextLine());
        circumference = 2 * Math.PI * radius;
        areaOfCircle = Math.PI * radius * radius;

        System.out.println("Radius of the circle is: " + radius);
        System.out.println("Circumference of circle is: " + circumference);
        System.out.println("Area of the circle is: " + areaOfCircle);
    } // end of main method
} // end of Circle3 class
