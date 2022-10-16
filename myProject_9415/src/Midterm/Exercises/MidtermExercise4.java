/*
Author: Bagsan, Lei Ceasar A.
Programming Date: 10/12/2022
Exercise Number: Midterm Exercise Number 4
*/
/*
Problem:
Test the program given below with different possible input values. Note that the program allows
the user to enter invalid values (0 or negative number for the quantity, 0 or negative number for
the unit price, etc.). In addition, the program allows the user to enter a cash tendered amount
that is lesser that the amount to be paid.

Required:
Write an improved version of the program that will provide validation processes for the input
values. The following should be imposed: (Filename: MidtermExercise4.java)
● The quantity cannot be a negative number.
● The unit price must be greater than zero
● The discount rate cannot be negative and it cannot be more than 100 percent.
● The amount tendered cannot be lower than the amount to be paid.
If an input value is invalid, the user should be given an appropriate error message and a
directive to enter another value. The user may repeatedly supply an invalid value. The
processing should continue only after the user enters a valid value. Include a java comment to
identify the changes implemented in the program.

Algorithm:
1) Show prompt for product input
2) Get input for product
3) Show prompt for quantity input
4) Get input for product
5) Repeat process 3 and 4 if invalid input is entered;
6) Do the same processes as step 4, 5, 6 but for unit price and discount
7) Compute for total costs; totalCost = uPrice * qty
8) Compute for discount; discount = totalCost * (dRate / 100.0)
9) Compute for discounted cost; discountedCost = totalCost - discount
10) Do the same processes as step 4, 5, 6 but for the cash tendered
11) Compute for the change; change = amountTendered - discountedCost
12) Output the results of the program
*/
package Midterm.Exercises;
import java.util.Scanner;
import java.lang.*;
public class MidtermExercise4 {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        String pName = "";
        double uPrice, totalCost, discount, discountedCost,
                amountTendered, change;
        int qty, dRate;
        System.out.print("Product: ");
        pName = kbd.nextLine();
        do {
            System.out.print("Quantity: ");
            qty = Integer.parseInt(kbd.nextLine());
            if(qty < 0) {
                System.out.println("Quantity should not be negative. Try Again.");
            } //prompt if input is invalid
        } while (qty < 0);
        do {
            System.out.print("Unit Price: ");
            uPrice = Double.parseDouble(kbd.nextLine());
            if(uPrice <= 0) {
                System.out.println("Unit price should be greater than 0. Try Again.");
            } //prompt if input is invalid
        } while(uPrice <= 0);
        do {
            System.out.print("Discount: ");
            dRate = Integer.parseInt(kbd.nextLine());
            if(dRate < 0) {
                System.out.println("Discount cannot be less than 0%. Try Again.");
            } else if (dRate > 100) {
                System.out.println("Discount rate should not exceed 100%. Try Again.");
            } //prompt if input is invalid
        } while(dRate < 0 || dRate > 100);
        totalCost = uPrice * qty;
        discount = totalCost * (dRate / 100.0);
        discountedCost = totalCost - discount;
        do {
            System.out.print("Cash Tendered: ");
            amountTendered = Double.parseDouble(kbd.nextLine());
            if(amountTendered < discountedCost) {
                System.out.println("The amount tendered should not be greater than the discounted cost. Try Again.");
            } //prompt if input is invalid
        } while(amountTendered < discountedCost);
        change = amountTendered - discountedCost;

        System.out.printf("%-25s%12s%n", "---------------", "------------ --");
                System.out.printf("%-25s%12.2f%n", "Total Purchase Amount: ", totalCost);
        System.out.printf("%-25s%12.2f%n", "Total Discount: ", discount);
        System.out.printf("%-25s%12.2f%n", "Amount to be Paid: ", discountedCost);
        System.out.printf("%-25s%12.2f%n", "change: ", change);
        System.exit(0);
    } // end of main method
} // end of class