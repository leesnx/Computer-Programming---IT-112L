/*
 * Author: Bagsan, Lei Ceasar A.
 * Programming Date: 08/23/2022
 * Activity Name and Number: Optional Exercises 5
 */

package Prelim.Exercises;

import java.util.Scanner;
import java.lang.*;

public class TemperatureConverterC {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        double celsius; // to hold temperature in degrees celsius
        double fahrenheit; // to hold temperature in degrees fahrenheit
        int choice;
        // double convertedValue;
        System.out.println("This program helps you convert temperature measures.");
        System.out.println("----------------Menu----------------------");
        System.out.println("1: Convert from Farenheit to Celsius");
        System.out.println("2: Convert from celsius to Fahrenheit");
        System.out.println("3: Quit");
        System.out.println("----------------Menu----------------------");
        System.out.print("Enter your choice<1/2/3>: ");
        choice = Integer.parseInt(keyboard.nextLine());
        if (choice == 1) { // missing Boolean Expression
            System.out.print("Enter the temperature in Fahrenheit: ");
            fahrenheit = Float.parseFloat(keyboard.nextLine());
//Compute then display the equivalent temperature in Celsius
            celsius = 5.0/9.0*(fahrenheit-32);
            System.out.println(fahrenheit + " degrees Fahrenheit equals " +
                    celsius + " degrees Celsius ");
        }
        if (choice == 2) { // missing Boolean Expression
            System.out.print("Enter the temperature in celsius: ");
            celsius = Float.parseFloat(keyboard.nextLine());
//Compute then display the equivalent temperature in Celsius
            fahrenheit = 9.0/5.0*celsius+32;
            System.out.println(celsius + " degrees celsius equals " +
                    fahrenheit + " degrees farenheit.");
        }
        if (choice == 3){ // missing Boolean Expression
            System.out.println("Thank you for using the program.");
        }
        if (choice < 1 || choice > 3) {
            System.out.println("Your choice is not valid.");
            System.out.println("Thank you!");
        }
        System.out.println("Thank you.");
        System.exit(0);
    } // end of main
} // end of class
