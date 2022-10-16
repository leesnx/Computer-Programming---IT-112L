/*
 * Author: Bagsan, Lei Ceasar A.
 * Programming Date: 09/12/2022
 * Class Code and Course Number: 9415A IT 112
 */

/*
Problem:
Create a program that prints your name a hundred times. Do three versions of this
program using a while loop, a do-while loop and a for-loop.
Sample run:
------------------------------------------------------------
Enter a name: Name
Name
Name
Name
Name
Name
...
(100th)Name
------------------------------------------------------------
Analysis
Inputs: name
Processes:
Read the input
Loop and print name 100 times
Outputs: name printed 100 times
Algorithm
1. Let name represents the string input
2. Show an introduction of the application/program
3. Read the value of name
4. Loop and print name until counter = 100
*/

package prelim.activities;

import java.lang.*;
import java.util.*;

public class HundredTimes2 {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = kbd.nextLine();

        int counter = 0;
        do{
            ++counter;
            System.out.println("("+ counter +")"+ name);
        }
        while(counter<100);
    }
}
