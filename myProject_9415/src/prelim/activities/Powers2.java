/*
 * Author: Bagsan, Lei Ceasar A.
 * Programming Date: 09/12/2022
 * Class Code and Course Number: 9415A IT 112
 */

/*
Problem:
Compute the power of a number given the base and exponent. Do three versions of this program
using a while loop, a do-while loop and a for loop.
Sample run:
------------------------------------------------------------
Base: 2
Exponent: 10
Product: 1024
------------------------------------------------------------
Analysis
Inputs: base, exponent
Processes:
Read the base
Read the exponent
Loop and multiply by itself the base as many times as the exponent
Outputs: product
Algorithm
1. Let base be the base number
2. Let exponent be the exponent of the base number
3. Show an introduction of the application/program
4. Read the value of base
5. Read the value of exponent
6. Let product be the total after looping the base
7. Loop the base as much as the exponent
8. While looping, multiply the base number to itself each time it loops
9. Print the product
*/

package prelim.activities;

import java.lang.*;
import java.util.*;

public class Powers2 {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);

        System.out.print("Enter base: ");
        int base = Integer.parseInt(kbd.nextLine());
        System.out.print("Enter exponent: ");
        int exponent = Integer.parseInt(kbd.nextLine());

        int product = 1, counter = 0;
        do{
            counter++;
            product = product * base;
        }
        while (counter < exponent);
        System.out.println("Product: " + product);
    }
}
