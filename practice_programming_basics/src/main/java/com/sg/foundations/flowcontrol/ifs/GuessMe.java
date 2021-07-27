package com.sg.foundations.flowcontrol.ifs;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class GuessMe {
    public static void main(String[] args) {
        int randVal = 1;
        Scanner inputScanner = new Scanner(System.in);
        int guess = -1;
        System.out.print("Your guess: ");
        try {
            guess = inputScanner.nextInt();
        }
        catch(NoSuchElementException | IllegalStateException e) {
            System.out.print(e.getMessage());
            return;
        }
        if(guess == randVal) {
            System.out.println("Wow, nice guess! That was it!");
        }
        else if(guess < randVal) {
            System.out.println("Ha, nice try - too low! I chose " + randVal + ".");
        }
        else if(guess > randVal) {
            System.out.println("Too bad, way too high. I chose " + randVal + ".");
        }
    }
}
