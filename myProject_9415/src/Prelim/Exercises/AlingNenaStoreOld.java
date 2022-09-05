/*
 * Author: Bagsan, Lei Ceasar A.
 * Programming Date: 08/22/2022
 * Activity Name and Number: Prelims Exercise Number 6
 */

package Prelim.Exercises;

import java.lang.*;
import java.util.*;

public class AlingNenaStoreOld {
    public static void main(String[] args) {
        Scanner ups = new Scanner(System.in);

        System.out.print("Which product do you wish to buy \n(1) eggs, \n(2) milk, \n(3) sardines, \n(0) End transaction \n:");
        int options = Integer.parseInt(ups.nextLine());

        int min = 1;
        int max = 100;

        Random random = new Random();

        int discount = random.nextInt(max + min);

        if (options == 1){
            double eggs = 5.00;
            System.out.print("\nProduct: eggs");
            System.out.print("\nQuantity: ");
            int quantityA = Integer.parseInt(ups.nextLine());
            System.out.println("Unit price: " + eggs);
            double totalA = eggs * quantityA;
            System.out.print("\nEntitled For Discount? \n(1)Yes \n(0)No \n:");
            int dis1 = Integer.parseInt(ups.nextLine());
            if (dis1 == 1){
                System.out.print("Discount: " + discount + "%");
            }
            else {
                discount = 0;
                System.out.print("Discount: " + discount + "%");
            }
            double cashA = 0;
            if (dis1== 1 || totalA > eggs || eggs == totalA){
                cashA = cashA + totalA - (totalA * discount / 100);
            }
            else {
                cashA = Math.round(totalA / 100) * 100;
            }
            System.out.printf("\nCash Tendered: %.2f", cashA);
            System.out.printf("\n\nTotal Purchase Amount: %.2f", totalA);
            double disAmtA = totalA * discount / 100;
            System.out.printf("\nTotal Discount: %.2f", disAmtA);
            double preA = totalA - disAmtA;
            System.out.printf("\nAmount To Be Paid: %.2f", preA);
            double changeA = cashA - preA;
            System.out.printf("\nChange: %.2f", changeA);
        }
        else if (options == 2) {
            double milk = 18.75;
            System.out.print("\nProduct: milk");
            System.out.print("\nQuantity: ");
            int quantityB = Integer.parseInt(ups.nextLine());
            System.out.println("Unit price: " + milk);
            double totalB = milk * quantityB;
            System.out.print("\nEntitled For Discount? \n(1)Yes \n(0)No \n:");
            int dis2 = Integer.parseInt(ups.nextLine());
            if (dis2 == 1){
                System.out.print("Discount: " + discount + "%");
            }
            else {
                discount = 0;
                System.out.print("Discount: " + discount + "%");
            }
            double cashB = 0;
            if (dis2 == 1 || totalB > milk || milk == totalB){
                cashB = cashB + totalB - (totalB * discount / 100);
            }
            else {
                cashB = Math.round(totalB / 100) * 100;
            }
            System.out.printf("\nCash Tendered: %.2f", cashB);
            System.out.printf("\n\nTotal Purchase Amount: %.2f", totalB);
            double disAmtB = totalB * discount / 100;
            System.out.printf("\nTotal Discount: %.2f", disAmtB);
            double preB = totalB - disAmtB;
            System.out.printf("\nAmount To Be Paid: %.2f", preB);
            double changeB = cashB - preB;
            System.out.printf("\nChange: %.2f", changeB);
        }
        else if (options == 3) {
            double sardines = 23.50;
            System.out.print("\nProduct: sardines");
            System.out.print("\nQuantity: ");
            int quantityC = Integer.parseInt(ups.nextLine());
            System.out.println("Unit price: " + sardines);
            double totalC = sardines * quantityC;
            System.out.print("\nEntitled For Discount? \n(1)Yes \n(0)No \n:");
            int dis3 = Integer.parseInt(ups.nextLine());
            if (dis3 == 1){
                System.out.print("Discount: " + discount + "%");
            }
            else {
                discount = 0;
                System.out.print("Discount: " + discount + "%");
            }
            double cashC = 0;
            if (dis3 == 1 || totalC > sardines || sardines == totalC){
                cashC = cashC + totalC - (totalC * discount / 100);
            }
            else {
                cashC = Math.round(totalC / 100) * 100;
            }
            System.out.printf("\nCash Tendered: %.2f", cashC);
            System.out.printf("\n\nTotal Purchase Amount: %.2f", totalC);
            double disAmtC = totalC * discount / 100;
            System.out.printf("\nTotal Discount: %.2f", disAmtC);
            double preC = totalC - disAmtC;
            System.out.printf("\nAmount To Be Paid: %.2f", preC);
            double changeC = cashC - preC;
            System.out.printf("\nChange: %.2f", changeC);
        }
        else{
            System.out.println("\nThank you come again!");
        }
    }
}
