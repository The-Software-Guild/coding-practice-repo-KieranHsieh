package com.sg.foundations.scanner;

import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class BiggerBetterAdder {
    private static Scanner InputScanner = new Scanner(System.in);
    private static int PromptForIntegerInput(String prompt) {
        System.out.print(prompt);
        try {
            return InputScanner.nextInt();
        }
        catch(NoSuchElementException | IllegalStateException e) {
            System.out.print(e.getMessage());
        }
        return -1;
    }
    public static void main(String[] args) {
        int total = 0;
        int numNumbers = PromptForIntegerInput("How many numbers would you like to add together? ");
        StringBuilder strEq = new StringBuilder();
        for(int i = 0; i < numNumbers; i ++) {
            int num = PromptForIntegerInput("Enter number " + (i + 1) + ": ");
            if(num < 0) {
                return;
            }
            strEq.append(num);
            if(i != numNumbers - 1) {
                strEq.append(" + ");
            }
            else {
                strEq.append(" = ");
            }
            total += num;
        }
        strEq.append(total);
        System.out.println(strEq);
    }
}
