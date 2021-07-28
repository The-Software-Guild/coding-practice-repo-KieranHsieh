package com.sg.foundations.flowcontrol.random;

import java.util.Random;
import java.util.Scanner;

public class HighRoller {
    public static void main(String[] args) {
        Random diceRoller = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of sides on the dice: ");
        int numberOfSides = scanner.nextInt();
        int rollResult = diceRoller.nextInt(numberOfSides) + 1;

        System.out.println("TIME TO ROOOOOOLL THE DICE!");
        System.out.println("I rolled a " + rollResult);

        if (rollResult == 1) {
            System.out.println("You rolled a critical failure! Ouch");
        }
        else if(rollResult == numberOfSides) {
            System.out.println("You rolled a critical! Nice Job!");
        }
    }
}
