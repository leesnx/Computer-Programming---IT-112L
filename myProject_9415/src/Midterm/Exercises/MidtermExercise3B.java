/*
Author: Bagsan, Lei Ceasar A.
Programming date: 10/12/2022
Exercise Number: Midterm Exercise Number 3
*/
/*
Problem:
Write a program for computing the amount of money in a bank account at the end of each quarter for
a period of one year. A quarter is equivalent to 3 months. Assume that the account is created at the
beginning of a year (i.e. January 1). The year will be entered at run time through the keyboard. The
account has an initial principal that is entered at run time through the keyboard. No deposit or
withdrawal is made within the one-year period. The interest is compounded quarterly which means
that the interest earned for the first quarter will form part of the principal for the second quarter, the
interest earned for the second quarter will form part of the principal for the third quarter and so on. The annual interest rate is 5%. The interest rate for a quarter is computed by dividing the
annual interest rate by 4 since there are four quarters in a year. The computational procedure (see
algorithm) and the output of the program (see sample run) are shown below. The output includes a
table showing the year, quarter number, interest earned and the new principal. The new principal is
the amount at the end of the quarter.

Algorithm:
1) Declare the necessary variables.
2) Let annual interest rate be set to 0.05. (Note 5.00% = 0.05).
3) Accept the year.
4) Accept the initial principal.
5) Display principal formatted with two digits after decimal point.
6) Display annual interest rate in percent form.
7) Display the column headings for the table.
8) Compute the interest rate for a quarter.
9) Make a for loop; for(quarter = 1; quarter <= 4; quarter++)
10) Inside the for statement, Compute the interest earned for the current quarter
11) Compute the new amount (amount at the end of the current quarter)
12) Display the year, quarter, interest earned and balance at the end of current quarter
*/
package Midterm.Exercises;

import java.lang.*;
import java.util.*;

public class MidtermExercise3B {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        float annualRate;
        float quarterlyRate;
        double principal;
        double interest;
        double finalAmount;
        byte quarter;
        int year;
        annualRate = 0.05F; // set annual interest to 5%
        System.out.print("Enter the year: ");
        year = Integer.parseInt(keyboard.nextLine());
        System.out.print("Enter the initial principal: ");
        principal = Double.parseDouble(keyboard.nextLine());
        System.out.printf("%s%.2f%n", "Principal = ", principal);
        System.out.printf("%s%.2f%c%n", "Interest Rate = ", annualRate * 100, '%');
        System.out.printf("%6s%8s%16s%30s%n", "Year", "Quarter", "Interest Earned", "Amount at end of quarter");
        quarterlyRate = annualRate / 4;
        for(quarter=1; quarter<=4; quarter++){
            interest = principal * quarterlyRate;
            finalAmount = principal + interest;
            System.out.printf("%6s%8d%16.2f%30.2f%n", year, quarter, interest, finalAmount);
            principal = finalAmount;
        }
        System.exit(0);
    } // end of the main method
} // end of the class