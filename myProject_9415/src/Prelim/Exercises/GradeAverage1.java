/*
 * Author: Bagsan, Lei Ceasar A.
 * Programming Date: 08/22/2022
 * Activity Name and Number: Prelims Exercise Number 9
 */

package Prelim.Exercises;

import java.lang.*; // import statement
import java.util.Scanner;

public class GradeAverage1 { // class declaration
    public static void main(String[] args) { // main method declaration
        Scanner kbd = new Scanner(System.in); // setting up Scanner

        int grade;
        int units;
        int totalGrade = 0;
        int totalUnits = 0;
        double average;

        System.out.print("Enter the grade of the student for the 1st subject: ");
            grade = Integer.parseInt(kbd.nextLine());
        System.out.print("Enter the number of units for the 1st subject: ");
            units = Integer.parseInt(kbd.nextLine());
        totalGrade = totalGrade + grade * units;
        totalUnits = totalUnits + units;
        System.out.print("Enter the grade of the student for the 2nd subject: ");
            grade = Integer.parseInt(kbd.nextLine());
        System.out.print("Enter the number of units for the 2nd subject: ");
            units = Integer.parseInt(kbd.nextLine());
        totalGrade = totalGrade + grade * units;
        totalUnits = totalUnits + units;
        System.out.print("Enter the grade of the student for the 3rd subject: ");
        grade = Integer.parseInt(kbd.nextLine());
        System.out.print("Enter the number of units for the 3rd subject: ");
        units = Integer.parseInt(kbd.nextLine());
        totalGrade = totalGrade + grade * units;
        totalUnits = totalUnits + units;
        System.out.print("Enter the grade of the student for the 4th subject: ");
        grade = Integer.parseInt(kbd.nextLine());
        System.out.print("Enter the number of units for the 4th subject: ");
        units = Integer.parseInt(kbd.nextLine());
        totalGrade = totalGrade + grade * units;
        totalUnits = totalUnits + units;
        System.out.print("Enter the grade of the student for the 5th subject: ");
        grade = Integer.parseInt(kbd.nextLine());
        System.out.print("Enter the number of units for the 5th subject: ");
        units = Integer.parseInt(kbd.nextLine());
        totalGrade = totalGrade + grade * units;
        totalUnits = totalUnits + units;
        System.out.print("Enter the grade of the student for the 6th subject: ");
        grade = Integer.parseInt(kbd.nextLine());
        System.out.print("Enter the number of units for the 6th subject: ");
        units = Integer.parseInt(kbd.nextLine());
        totalGrade = totalGrade + grade * units;
        totalUnits = totalUnits + units;
        System.out.print("Enter the grade of the student for the 7th subject: ");
        grade = Integer.parseInt(kbd.nextLine());
        System.out.print("Enter the number of units for the 7th subject: ");
        units = Integer.parseInt(kbd.nextLine());
        totalGrade = totalGrade + grade * units;
        totalUnits = totalUnits + units;
        System.out.print("Enter the grade of the student for the 8th subject: ");
        grade = Integer.parseInt(kbd.nextLine());
        System.out.print("Enter the number of units for the 8th subject: ");
        units = Integer.parseInt(kbd.nextLine());
        totalGrade = totalGrade + grade * units;
        totalUnits = totalUnits + units;
        System.out.print("Enter the grade of the student for the 9th subject: ");
        grade = Integer.parseInt(kbd.nextLine());
        System.out.print("Enter the number of units for the 9th subject: ");
        units = Integer.parseInt(kbd.nextLine());
        totalGrade = totalGrade + grade * units;
        totalUnits = totalUnits + units;
        System.out.print("Enter the grade of the student for the 10th subject: ");
        grade = Integer.parseInt(kbd.nextLine());
        System.out.print("Enter the number of units for the 10th subject: ");
        units = Integer.parseInt(kbd.nextLine());
        totalGrade = totalGrade + grade * units;
        totalUnits = totalUnits + units;
        average = (double) totalGrade/totalUnits;
        System.out.print("Your Average Grade = " + average);
        if (average >= 85){
            System.out.print(". \nCongratulations! You belong to the dean's list.");
        }
        if (average < 85){
            System.out.print(". \nSorry! You did not make it to the dean's list. Do better next term.");
        }
    } // end of main method
} // end of GradeAverage1 class
