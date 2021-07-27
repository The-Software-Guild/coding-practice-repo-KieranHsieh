package com.sg.foundations.scanner;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class AllTheTrivia {
    private static Scanner InputScanner = new Scanner(System.in);
    private static String PromptForStringInput(String prompt) {
        System.out.print(prompt);
        try {
            return InputScanner.nextLine();
        }
        catch(NoSuchElementException | IllegalStateException e) {
            System.out.print(e.getMessage());
        }
        return null;
    }
    public static void main(String[] args) {
        String gigAnswer = PromptForStringInput("What unit is equivalent to 1,024 Gigabytes? ");
        String planetAnswer = PromptForStringInput("Which planet is the only one that rotates clockwise in our Solar System? ");
        String volcAnswer = PromptForStringInput("The largest volcano ever discovered in our Solar System is located on which planet? ");
        String elementAnswer = PromptForStringInput("What is the most abundant element in the earth's atmosphere? ");
        System.out.println();
        System.out.println(String.format("Wow! 1024 Gigabytes is a %s!\n" +
                "I didn't know that the largest volcano ever discovered was on %s!\n" +
                "That's amazing that %s is the most abundant element in the earth's atmosphere...\n" +
                "%s is the only planet that rotates clockwise, neat!",
                volcAnswer, gigAnswer, planetAnswer, elementAnswer));
    }
}
