/*
 * Author: Bagsan, Lei Ceasar A.
 * Programming Date: 09/12/2022
 * Class Code and Course Number: 9415A IT 112
 */

/*
Problem:
Get three exam grades from the user and compute the average of the grades. Output the average
of the three exams. Together with the average, also include a good remark in the output if the
average is greater than or equal to 75, otherwise output :-(.
Sample run:
------------------------------------------------------------
Enter the first exam grade (a): 80
Enter the second exam grade (b): 60
Enter the third exam grade (c): 50
The average of a, b, and c is 63.
------------------------------------------------------------
Analysis
Inputs: exam grades a, b and c
Processes:
Read the grades
Compute the average
Show the average
Outputs: average
Algorithm
1. Let a represent the first exam grade
2. Let b represent the second exam grade
3. Let c represent the third exam grade
4. Let ave represent the average exam grade
5. Show an introduction of the application/program
6. Read the value of a
7. Read the value of b
8. Read the value of c
9. Compute ave = (a+b+c)/3;
10. Display the average.
*/

package prelim.activities;

import java.lang.*;
import java.util.*;

public class Grades1 {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);

        System.out.print("Enter the first exam grade: ");
        int a = Integer.parseInt(kbd.nextLine());
        System.out.print("Enter the second exam grade: ");
        int b = Integer.parseInt(kbd.nextLine());
        System.out.print("Enter the third exam grade: ");
        int c = Integer.parseInt(kbd.nextLine());

        int ave = (a + b + c) / 3;
        System.out.printf("\n%s%3d%n", "Average:", ave);

        if (ave >= 75){
            System.out.println("Great work! Keep it up!");
        }
        else {
            System.out.println(":-(");
        }
    }
}