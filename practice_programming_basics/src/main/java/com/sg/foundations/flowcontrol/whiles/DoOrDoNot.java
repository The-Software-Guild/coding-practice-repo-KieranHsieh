package com.sg.foundations.flowcontrol.whiles;

import java.util.Scanner;

public class DoOrDoNot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Should I do it? (y/n) ");
        boolean doIt;

        if (input.next().equals("y")) {
            doIt = true; // DO IT!
        } else {
            doIt = false; // DONT YOU DARE!
        }

        boolean iDidIt = false;

        do {
            iDidIt = true;
            break;
        } while (doIt);

        if (doIt && iDidIt) {
            System.out.println("I did it!"); // If you say yes
        } else if (!doIt && iDidIt) {
            System.out.println("I know you said not to ... but I totally did anyways."); // If you say no
        } else {
            System.out.println("Don't look at me, I didn't do anything!"); // Not reached bc line 20
        }
    }
}
