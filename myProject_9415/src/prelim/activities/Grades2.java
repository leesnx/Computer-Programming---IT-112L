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
import javax.swing.*;

public class Grades2 {
    public static void main(String[] args) {
        boolean validAmount = false;
        String stringToDisplay = "";
        String inputString;
        int a=0,b=0,c=0,ave=0;

        while ( !validAmount ){
            try {
                inputString = JOptionPane.showInputDialog("Enter first exam grade: ");
                a = Integer.parseInt(inputString);
                inputString = JOptionPane.showInputDialog("Enter second exam grade: ");
                b = Integer.parseInt(inputString);
                inputString = JOptionPane.showInputDialog("Enter third exam grade: ");
                c = Integer.parseInt(inputString);

                ave = (a + b + c) / 3;
                if (a<100 && b<100 && c<100) {
                    validAmount = true;
                    JOptionPane.showMessageDialog(null, "The average of the three exams is " + ave);
                } else {
                    JOptionPane.showMessageDialog(null, "The invalid input detected.");
                }
            } catch (Exception exception){
                validAmount = false;
                JOptionPane.showMessageDialog(null, "The grade is invalid");
            }
        } // end of while

        stringToDisplay = stringToDisplay + "First Exam Grade = " + a + "\n";
        stringToDisplay = stringToDisplay + "Second Exam Grade = " + b + "\n";
        stringToDisplay = stringToDisplay + "Third Exam Grade = " + c + "\n";
        stringToDisplay = stringToDisplay + "Grade Average = " + ave + "\n";

        JOptionPane.showMessageDialog(null, stringToDisplay);

    }

}
