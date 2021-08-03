package com.sg.foundations.flowcontrol.arrays;

public class SimpleCombination {
    public static void main(String[] args) {
        int[] firstHalf = {3, 7, 9, 10, 16, 19, 20, 34, 35, 45, 47, 49}; // 12 numbers
        int[] secondHalf = {51, 54, 68, 71, 75, 78, 82, 84, 85, 89, 91, 100}; // also 12!

        int[] wholeNumbers = new int[24];

        // Combining code should go here!
        int curIdx = 0;
        for(int i : firstHalf) {
            wholeNumbers[curIdx] = i;
            curIdx++;
        }
        for(int i : secondHalf) {
            wholeNumbers[curIdx] = i;
            curIdx++;
        }
        // Printing code should go here
        for(int i : wholeNumbers) {
            System.out.println(i);
        }
    }
}
