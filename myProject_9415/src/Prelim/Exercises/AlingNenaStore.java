/*
 * Author: Bagsan, Lei Ceasar A.
 * Programming Date: 09/05/2022
 * Activity Name and Number: Prelims Exercise Number 6
 */

package Prelim.Exercises;

import java.lang.*;
import java.util.*;

public class AlingNenaStore {
    public static void main(String[] args) {
        Scanner ups = new Scanner(System.in);

        /*Inputs*/
        //Product
        System.out.print("Product: ");
        String product = ups.nextLine();

        //Quantity
        System.out.print("Quantity: ");
        double quantity = ups.nextDouble();

        //Unit Price
        System.out.print("Unit Price: ");
        double uprice = ups.nextDouble();

        //Discount
        System.out.print("Discount (%): ");
        double discount = ups.nextDouble();

        //Cash Tendered
        System.out.print("Cash Tendered: ");
        double casht = ups.nextDouble();

        /*Outputs*/
        System.out.println("------------------------------");
        System.out.println("Product: " + product);
        //Total Purchase Amount
        double tpa = quantity * uprice;
        System.out.println("Total Purchase Amount: " + tpa);

        //Total Discount
        double td = discount/100 * tpa;
        System.out.println("Total Discount: " + td);

        //Amount to be Paid
        double atbp = tpa - td;
        System.out.println("Amount To Be Paid: " + atbp);

        //Change
        double change = casht - atbp;
        System.out.println("Change: " + change);
        System.out.println("------------------------------");
    }
}