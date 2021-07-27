package com.sg.foundations.flowcontrol.ifs;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class YourLifeInMovies {
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
        String name = PromptForStringInput("Hey, let's play a game! What's your name? ");
        if(name == null) { return; }
        System.out.print("Ok," + name + ", when were you born? ");
        int year = -1;
        try {
            year = InputScanner.nextInt();
        }
        catch(NoSuchElementException | IllegalStateException e) {
            System.out.print(e.getMessage());
            return;
        }
        System.out.println("Well " + name + "...");
        String prefix = "Did you know that ";
        if(year < 2005) {
            System.out.println(prefix + "Pixar's 'Up' came out over a decade ago");
            prefix = "And that ";
        }
        if(year < 1995) {
            System.out.println(prefix + "the first Harry Potter came out over 15 years ago");
            if(prefix.equalsIgnoreCase("And that ")) {
                prefix = "Also, that ";
            }
            else {
                prefix = "And that ";
            }
        }
        if(year < 1985) {
            System.out.println(prefix + "Space Jam came out not last decade, but the one before THAT.");
            if(prefix.equalsIgnoreCase("And that ")) {
                prefix = "Also, that ";
            }
            else {
                prefix = "And that ";
            }
        }
        if(year < 1975) {
            System.out.println(prefix + "the original Jurassic Park release is closer to the first lunar landing than it is to today.");
            if(prefix.equalsIgnoreCase("And that ")) {
                prefix = "Also, that ";
            }
            else {
                prefix = "And that ";
            }
        }
        if(year < 1965) {
            System.out.println(prefix + "the MASH TV series has been around for almost half a century!");
        }
    }
}
