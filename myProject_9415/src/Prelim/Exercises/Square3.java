/*
 * Author: Bagsan, Lei Ceasar A.
 * Programming Date: 08/22/2022
 * Activity Name and Number: Prelims Exercise Number 4
 */

package Prelim.Exercises;

import java.lang.*; // import statement
import java.util.Scanner;

public class Square3 { // class declaration
    public static void main(String[] args) { // main method declaration
        Scanner kbd = new Scanner(System.in); // setting up Scanner

        int side;
        double perimeter;
        double areaOfSquare;

        System.out.print("Type the value of side then press the enter key: ");
        side = Integer.parseInt(kbd.nextLine());
        perimeter = 4 * side;
        areaOfSquare = side * side;

        System.out.println("Side of the square is: " + side);
        System.out.println("Perimeter of square is: " + perimeter);
        System.out.println("Area of the square is: " + areaOfSquare);
    } // end of main method
} // end of Square3 class
