/*
 * Author: Bagsan, Lei Ceasar A.
 * Programming Date: 09/12/2022
 * Class Code and Course Number: 9415A IT 112
 */

/*
Problem:
Create a program that will be used at the check-out counter of Aling Nena's Sari-Sari Store.
Follow the assumptions given in the following description of Aling Nena’s store.
The customers of Aling Nena's store always buy only one type of product, but they may buy one
or more pieces of the said product. For example, a customer may buy 12 pieces of eggs or 2
packs of milk.
Notes:
Depending on the customer, Aling Nena may decide to give the customer a discount, expressed
as an integer value from 1 to 100, which indicates the percentage deducted from the total amount
of the customer's purchase. For example, assuming that eggs cost P5.00 a piece, a dozen eggs
would cost a total of P60.00; if the customer is given a 10 percent discount, then the customer
will have to pay only P54.00 for one dozen of eggs. Customers who are not entitled to discounts
are given zero (0) percent discount. Aling Nena's customers always pay in cash, and the cash
amount tendered is always greater than or equal to the total purchase amount. Your program
must calculate the change to be given to the customer.
Sample run:
------------------------------------------------------------
1. Sample Input:

Product: eggs
Quantity: 12
Unit Price: 5.00
Discount: 10
Cash Tendered: 100.00

Sample Output:

Total Purchase Amount: 60.00
Total Discount: 6.00
Amount To Be Paid: 54.00
Change: 46.00

2. Sample Input:

Product: milk
Quantity: 3
Unit Price: 18.75
Discount: 0
Cash Tendered: 60.00

Sample Output:

Total Purchase Amount: 56.25
Total Discount: 0.00
Amount To Be Paid: 56.25
Change: 3.75

3. Sample Input:

Product: sardines
Quantity: 2
Unit Price: 23.50
Discount: 25
Cash Tendered: 35.25

Sample Output:

Total Purchase Amount: 47.00
Total Discount: 11.75
Amount To Be Paid: 35.25
Change: 0.00
------------------------------------------------------------
Analysis
Inputs: product, quantity, unit price, discount, cash tendered
Processes:
Get input for product
Get input for quantity
Get input for unit price
Get input for the discount
Get input for the cash tendered
Calculate total purchase amount
Calculate total discount
Calculate amount to be paid
Calculate for change
Outputs: total purchase amount, total discount, amount to be paid, change
Algorithm
1. Let product represent the product
2. Let quantity represent the quantity
3. Let price represent the unit price
4. Let discount represent the discount
5. Let cash represent the cash tendered
6. Calculate for total purchase amount
7. Calculate for total discount
8. Calculate for amount to be paid
9. Calculate for change
10. Display the computed total purchase amount, total discount, amount to be paid, and change
*/


package prelim.activities;

import java.lang.*;
import java.util.*;

public class AlingNenaStore {
    public static void main(String[] args) {
        Scanner ups = new Scanner(System.in);

        System.out.print("Product: ");
        String product = ups.nextLine();

        System.out.print("Quantity: ");
        double quantity = ups.nextDouble();

        System.out.print("Unit Price: ");
        double uprice = ups.nextDouble();

        System.out.print("Discount (%): ");
        double discount = ups.nextDouble();

        System.out.print("Cash Tendered: ");
        double casht = ups.nextDouble();

        System.out.println("------------------------------");
        System.out.println("Product: " + product);

        double tpa = quantity * uprice;
        System.out.println("Total Purchase Amount: " + tpa);


        double td = discount/100 * tpa;
        System.out.println("Total Discount: " + td);

        double atbp = tpa - td;
        System.out.println("Amount To Be Paid: " + atbp);

        double change = casht - atbp;
        System.out.println("Change: " + change);
        System.out.println("------------------------------");
    }
}
