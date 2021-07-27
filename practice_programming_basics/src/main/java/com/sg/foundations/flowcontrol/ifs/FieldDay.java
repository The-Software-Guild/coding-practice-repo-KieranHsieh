package com.sg.foundations.flowcontrol.ifs;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class FieldDay {
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
    private static void PrintTeamName(String teamName) {
        System.out.println("Aha! You're on the team \"" + teamName + "\"!");
        System.out.println("Good luck in the games!");
    }
    public static void main(String[] args) {
        String name = PromptForStringInput("What is your last name? ");
        if(name.compareTo("Baggins") < 0) {
            PrintTeamName("Red Dragons");
        }
        else if(name.compareTo("Baggins") > 0 && name.compareTo("Dresden") < 0) {
            PrintTeamName("Dark Wizards");
        }
        else if(name.compareTo("Dresden") > 0 && name.compareTo("Howl") < 0) {
            PrintTeamName("Moving Castles");
        }
        else if(name.compareTo("Howl") > 0 && name.compareTo("Potter") < 0) {
            PrintTeamName("Golden Snitchers");
        }
        else if(name.compareTo("Potter") > 0 && name.compareTo("Vimes") < 0) {
            PrintTeamName("Night Guards");
        }
        else if(name.compareTo("Vimes") > 0) {
            PrintTeamName("Block Holes");
        }
        else {
            System.out.println("We couldn't find you a team, sorry!");
        }
    }
}
