/*
 * Author: Bagsan, Lei Ceasar A.
 * Programming Date: 09/12/2022
 * Class Code and Course Number: 9415A IT 112
 */

/*
Problem:
Given the base and height of a Right Triangle, the perimeter is computed as the sum of the base,
height and hypotenuse. The hypotenuse is the square root of base2 + height2. In addition, the area
is computed as (1/2) * base * height. Create a program for computing the perimeter and area of a
Right Triangle. Show the appropriate algorithm through a multiline comment before the class
declaration.
Sample run:
------------------------------------------------------------
base: 3
height: 4
hypotenuse = 5;
perimeter = 12;
AreaOfTriangle = ;
------------------------------------------------------------
Analysis
Inputs/Given: base, height
Processes:
Read the given
Compute for the hypotenuse
Compute for the perimeter of the triangle
Compute for the area of the triangle
Outputs: hypotenuse, area, perimeter
Algorithm
1. Let base represent the base
2. Let height represent the height
3. Solve for hypotenuse = base*base + height*height;
4. Solve for perimeter = base + height + hypotenuse;
5. Solve for AreaOfTriangle = (0.5) * base * height;
6. Display the computed hypotenuse, perimeter, and area
*/

package prelim.activities;

import java.lang.*;

public class RightTriangle {
    public static void main(String[] args) {
        int base = 3, height = 4;
        int hypotenuse = (int) Math.sqrt((int) Math.pow(base, 2) + (int) Math.pow(height, 2));
        int perimeter = base + height + hypotenuse;
        double AreaOfTriangle = (0.5) * base * height;

        System.out.println("base: " + base);
        System.out.println("height: " + height);
        System.out.println("hypotenuse: " + hypotenuse);
        System.out.println("perimeter: " + perimeter);
        System.out.println("area: " + AreaOfTriangle);
    }
}
