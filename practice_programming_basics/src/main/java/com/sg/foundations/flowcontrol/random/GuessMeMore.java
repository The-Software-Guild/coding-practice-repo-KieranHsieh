package com.sg.foundations.flowcontrol.random;

import java.util.NoSuchElementException;
import java.util.Random;
import java.util.Scanner;

public class GuessMeMore {
    static boolean checkAnswer(int answer, int guess) {
        if(guess == answer) {
            System.out.println("Wow, nice guess! That was it!");
            return true;
        }
        else if(guess < answer) {
            System.out.print("Ha, nice try - too low!");
        }
        else if(guess > answer) {
            System.out.print("Too bad, way too high.");
        }
        return false;
    }
    public static void main(String[] args) {
        Random rand = new Random();
        int randVal = rand.nextInt(200) - 100;
        System.out.println("I've chosen a number between -100 and 100. Bet you can't guess it!");
        Scanner inputScanner = new Scanner(System.in);
        int guess = -1;
        System.out.print("Your guess: ");
        guess = inputScanner.nextInt();
        if(!checkAnswer(randVal, guess)) {
            System.out.println("Try Again!");
            System.out.print("Your guess: ");
            guess = inputScanner.nextInt();
            checkAnswer(randVal, guess);
        }

    }
}
