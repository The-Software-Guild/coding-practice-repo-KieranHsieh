package com.sg.foundations.scanner;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class HealthyHearts {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("How old are you? ");
        int age = -1;
        try {
            age = inputScanner.nextInt();
        }
        catch(NoSuchElementException | IllegalStateException e) {
            System.out.print(e.getMessage());
            return;
        }
        int maxHeartRate = 220 - age;
        int minZone = maxHeartRate / 2;
        int maxZone = (int)Math.ceil((float)(maxHeartRate) * 0.85f);
        System.out.println("Your maximum heart rate should be " + (220 - age) + " beats per minute");
        System.out.println(String.format("Your target HR zone is %d - %d beats per minute.", minZone, maxZone));
    }
}
