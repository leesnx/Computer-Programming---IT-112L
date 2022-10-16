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
Outputs: string output
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

public class NumberInWords1 {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);

        System.out.print("Input a number from 1 to 10: ");
        int num = Integer.parseInt(kbd.nextLine());

        if(num==1){
            System.out.println("In words: one");
        }
        else if(num==2){
            System.out.println("In words: two");
        }
        else if(num==3){
            System.out.println("In words: three");
        }
        else if(num==4){
            System.out.println("In words: four");
        }
        else if(num==5){
            System.out.println("In words: five");
        }
        else if(num==6){
            System.out.println("In words: six");
        }
        else if(num==7){
            System.out.println("In words: seven");
        }
        else if(num==8){
            System.out.println("In words: eight");
        }
        else if(num==9){
            System.out.println("In words: nine");
        }
        else if(num==10){
            System.out.println("In words: ten");
        }
    }
}
