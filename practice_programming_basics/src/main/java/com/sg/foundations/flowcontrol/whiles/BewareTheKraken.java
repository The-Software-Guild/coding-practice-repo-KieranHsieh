package com.sg.foundations.flowcontrol.whiles;

import java.util.Random;
import java.util.Scanner;

public class BewareTheKraken {
    private static final String[] FISH_NAMES = { "Tuna", "Trout", "Bass" };
    private static String chooseRandomFish(Random rand) {
        int idx = rand.nextInt(3);
        return FISH_NAMES[idx];
    }
    public static void main(String[] args) {
        System.out.println("Already, get those flippers and wetsuit on - we're going diving!");
        System.out.println("Here we goooOOooOooo.....! *SPLASH*");

        int depthDivedInFt = 0;
        Random rand = new Random();
        // Turns out the ocean is only so deep, 36200 at the deepest survey,
        // so if we reach the bottom ... we should probably stop.
        while(true){
            System.out.println("So far, we've swum " + depthDivedInFt + " feet");
            Scanner scanner = new Scanner(System.in);
            System.out.print("Do you want to continue? ");
            String answer = scanner.nextLine();
            if(!answer.equals("y")) {
                break;
            }
            System.out.println("I think I see a " + chooseRandomFish(rand) + "!");
            if(depthDivedInFt >= 20000){
                System.out.println("Uhhh, I think I see a Kraken, guys ....");
                System.out.println("TIME TO GO!");
                break;
            }

            // I can swim, really fast! 500ft at a time!
            depthDivedInFt += 1000;
        }
        System.out.println("");
        System.out.println("We ended up swimming " + depthDivedInFt + " feet down.");
        System.out.println("I bet we can do better next time!");
    }
}
