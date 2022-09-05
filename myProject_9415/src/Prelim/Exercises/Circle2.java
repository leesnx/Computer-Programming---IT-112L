/*
 * Author: Bagsan, Lei Ceasar A.
 * Programming Date: 08/22/2022
 * Activity Name and Number: Prelims Exercise Number 3
 */

package prelim.exercises;

import java.lang.*; // import statement

public class Circle2 { // class declaration
    public static void main(String[] args) { // main method declaration
        double radius;
        double area;

        area = 100.0;
        radius = Math.sqrt(area/Math.PI);

        System.out.println("Given area of circle: " + area);
        System.out.println("Computed radius of circle: " + radius);
    } // end of main method
} // end of Circle2 class
