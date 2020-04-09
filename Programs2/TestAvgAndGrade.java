//Write a program that asks the user to enter five test scores. The program should display a letter grade for each score and the average test score. Write the following methods in the program:
//        calcAverage:
//        This method should accept five test scores as arguments and return the average of the scores.
//        determineGrade:
//        This method should accept a test score as an argument and return a letter grade for the score, based on the following grading scale:
//
//        Score Letter Grade
//        90-100 A
//        80-89 B
//        70-79 C
//        60-69 D
//        Below 60 F
//
//        Sample Run
//        java TestAvgAndGrade
//
//        ·Enter·test·grade·for·student·1:55↵
//        ·Enter·test·grade·for·student·2:65↵
//        ·Enter·test·grade·for·student·3:75↵
//        ·Enter·test·grade·for·student·4:85↵
//        ·Enter·test·grade·for·student·5:95↵
//        ·The·letter·grades·are·as·follows:↵
//        Student·1:·F↵
//        Student·2:·D↵
//        Student·3:·C↵
//        Student·4:·B↵
//        Student·5:·A↵
//        The·average·grade·was:·75.00↵

import java.util.Scanner;
public class TestAvgAndGrade {

    public static void main(String[] args) {
        int grade1 = question(1);
        int grade2 = question(2);
        int grade3 = question(3);
        int grade4 = question(4);
        int grade5 = question(5);

        displayGrade(grade1, 1);
        displayGrade(grade2, 2);
        displayGrade(grade3, 3);
        displayGrade(grade4, 4);
        displayGrade(grade5, 5);

        displayAverage(grade1, grade2, grade3, grade4, grade5);
    }

    public static int question(int studentNumber) {
        Scanner keyboardListener = new Scanner(System.in);
        int grade;
        System.out.println("Enter test grade for student " + studentNumber);
        grade = keyboardListener.nextInt();
        return grade;
    }
    public static void displayGrade(int grade, int student) {
        System.out.println("Student " + student + ": " + determineGrade(grade));
    }
    public static void displayAverage(int grade1, int grade2, int grade3, int grade4, int grade5) {
        System.out.println("The average grade was: " + calcAverage(grade1, grade2, grade3, grade4, grade5));
    }
    public static char determineGrade(int grade) {
        int convertedGrade = grade/10;
        switch(convertedGrade) {
            case 10: {
                return 'A';
            }
            case 9: {
                return 'A';
            }
            case 8: {
                return 'B';
            }
            case 7: {
                return 'C';
            }
            case 6: {
                return 'D';
            }
            default:
                return 'F';
        }
    }
    public static double calcAverage(int grade1, int grade2, int grade3, int grade4, int grade5) {
        double average;
        average = (grade1 + grade2 + grade3 + grade4 + grade5)/5;
        return average;
    }
}