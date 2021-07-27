package com.sg.foundations.scanner;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class PassingTheTuringTest {
    private static String PromptForStringInput(Scanner scanner, String prompt) {
        System.out.print(prompt);
        try {
            return scanner.nextLine();
        }
        catch(NoSuchElementException | IllegalStateException e) {
            System.out.print(e.getMessage());
        }
        return null;
    }
    public static void main(String[] args) {
        Scanner inScan = new Scanner(System.in);
        System.out.println("Hello!");
        String name = PromptForStringInput(inScan, "What's your name? ");
        if(name == null) { return; }
        System.out.println("Hello " + name + "! I'm Alice.");
        String  favColor = PromptForStringInput(inScan, "What's your favorite color? ");
        if(favColor == null) { return; }
        System.out.println("Huh, " + favColor + "? Mine's Electric Lime.");
        System.out.println();
        System.out.println("I really like limes. THey're my favorite fruit too");
        String favFruit = PromptForStringInput(inScan,"What's YOUR favorite fruit, " + name + "? ");
        if(favFruit == null) { return; }
        System.out.println("Really? " + favFruit + "? That's wild!");
        String favNumber = PromptForStringInput(inScan, "Speaking of favorites, what's your favorite number? ");
        if(favNumber == null) { return; }
        System.out.println(favNumber + " is a cool number. Mine's -7");
        System.out.println("Did you know that " + favNumber + " * -7 is " + (Integer.parseInt(favNumber) * -7) + "? That's a cool number too!");
        System.out.println("Well, thanks for talking to me, " + name + "!");
    }
}
