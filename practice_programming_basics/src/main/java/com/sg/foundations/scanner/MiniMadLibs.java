package com.sg.foundations.scanner;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class MiniMadLibs {
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
        System.out.println("Let's play MAD LIBS!\n");
        String param1 = PromptForStringInput("I need a noun: ");
        String param2 = PromptForStringInput("Now an adjective: ");
        String param3 = PromptForStringInput("Another noun: ");
        String param4 = PromptForStringInput("And a number: ");
        String param5 = PromptForStringInput("Another adjective: ");
        String param6 = PromptForStringInput("A plural noun: ");
        String param7 = PromptForStringInput("Another one: ");
        String param8 = PromptForStringInput("One more: ");
        String param9 = PromptForStringInput("A verb (infinitive form): ");
        String param10 = PromptForStringInput("Same verb (past participle): ");
        System.out.println("*** NOW LETS GET MAD (libs) ***");
        String libbed = String.format("%s: the %s frontier. " +
                "These are the voyages of the starship %s. " +
                "Its %s-year mission: to explore strange %s %s, " +
                "to seek out %s %s and %s %s, " +
                "to boldly %s where no one has %s before.",
                param1, param2, param3, param4, param5, param6, param5, param7, param5, param8, param9, param10);
        System.out.println(libbed);

    }
}
