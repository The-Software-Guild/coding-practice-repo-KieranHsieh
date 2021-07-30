package com.sg.foundations.flowcontrol.whiles;

import java.util.Scanner;

public class StayPositive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What number should I count down from? ");
        int startingValue = scanner.nextInt();
        System.out.println("Here goes!");
        int counter = startingValue;
        int numberInCurrentLine = 0;
        while(counter >= 0) {
            numberInCurrentLine++;
            System.out.print(counter + " ");
            if(numberInCurrentLine == 10) {
                System.out.println();
                numberInCurrentLine = 0;
            }
            counter--;
        }
        System.out.println();
        System.out.println("Blast off!");
    }
}
