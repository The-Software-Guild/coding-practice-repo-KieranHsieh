package com.sg.foundations.scanner;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class DoItBetter {
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
        int milesResult = PromptForIntegerInput("How many miles can you run? ");
        System.out.println(String.format("Sorry, but I can run %d miles", (milesResult * 2) + 1));
        int dogResult = PromptForIntegerInput("How many hotdogs can you eat? ");
        System.out.println(String.format("Sorry, but I can eat %d hotdogs", (dogResult * 2) + 1));
        int langResult = PromptForIntegerInput("How many languages do you know? ");
        System.out.println(String.format("Sorry, but I know %d languages", (langResult * 2) + 1));
    }
}
