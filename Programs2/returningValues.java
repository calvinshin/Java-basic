//In a program, write a method that accepts two arguments: an array of integers and a number n. The method should print all of the numbers in the array that are greater than the number n (in the order that they appear in the array, each on their own line).
//
//        In the same file, create a main method and call your function using the following
//        data sets:
//
//        The array {1, 5, 10, 2, 4, -3, 6} and the number 3.
//        The array {10, 12, 15, 24} and the number 12.
//
//        Sample Run
//        ﻿java LargerThanN
//
//        5↵
//        10↵
//        4↵
//        6↵
//        15↵
//        24↵


public class returningValues {
    public static void main(String[] args) {
        int[] input = {1, 5, 10, 2, 4, -3, 6};
        largerThan(input, 3);
        int[] input2 = {10, 12, 15, 24};
        largerThan(input2, 12);
    }
    public static void largerThan(int[] array, int greaterThan) {
        for(int i:array) {
            if(i > greaterThan) {
                System.out.println(i);
            }
        }
    }
}