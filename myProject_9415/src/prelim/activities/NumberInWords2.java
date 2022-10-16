/*
 * Author: Bagsan, Lei Ceasar A.
 * Programming Date: 09/12/2022
 * Class Code and Course Number: 9415A IT 112
 */

/*
Problem:
Get a number as input from the user, and output the equivalent of the number in words. The
number inputted should range from 1-10. If the user inputs a number that is not in the range,
output, "Invalid number".
Sample run:
------------------------------------------------------------
Enter a number from 1 - 10: 1
Output: one
------------------------------------------------------------
Analysis
Inputs: number x
Processes:
Read the input
Convert integer to string
Show the output
Outputs: string of num otherwise "Invalid Number"
Algorithm
1. Let x represent a number from 1 to 10
2. Let num represent the number in string
3. Show an introduction of the application/program
4. Read the value of x
5. Convert x to string value
6. Switch to appropriate switch case as needed
7. Output case value
*/

package prelim.activities;

import java.lang.*;
import java.util.*;

public class NumberInWords2 {
        public static void main (String[]args){
            Scanner kbd = new Scanner(System.in);

            System.out.print("Input a number from 1 to 10: ");
            int num = Integer.parseInt(kbd.nextLine());

            switch(num) {
                case 1:
                    System.out.println("In words: one");
                    break;
                case 2:
                    System.out.println("In words: two");
                    break;
                case 3:
                    System.out.println("In words: three");
                    break;
                case 4:
                    System.out.println("In words: four");
                    break;
                case 5:
                    System.out.println("In words: five");
                    break;
                case 6:
                    System.out.println("In words: six");
                    break;
                case 7:
                    System.out.println("In words: seven");
                    break;
                case 8:
                    System.out.println("In words: eight");
                    break;
                case 9:
                    System.out.println("In words: nine");
                    break;
                case 10:
                    System.out.println("In words: ten");
                    break;
                default:
                    System.out.println("Invalid Number");
            }//end of switch
        }
}
