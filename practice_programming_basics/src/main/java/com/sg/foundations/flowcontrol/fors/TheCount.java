package com.sg.foundations.flowcontrol.fors;

import java.util.Scanner;

public class TheCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What number are we starting at? ");
        int start = scanner.nextInt();
        System.out.println("What number are we ending at? ");
        int stopAt = scanner.nextInt();
        System.out.println("What are we incrementing by? ");
        int increment = scanner.nextInt();
        for(int i = start; i <= stopAt; i+=increment) {
            System.out.print(i + " ");
        }
    }
}
