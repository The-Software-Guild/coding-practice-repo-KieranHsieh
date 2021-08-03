package com.sg.foundations.flowcontrol.fors;

import java.util.Scanner;

public class ForTimes {
    public static void main(String[] args) {
        System.out.print("Which times table shall I recite? ");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        for(int i = 1; i < 16; i ++) {
            System.out.println(input + " * " + i + " = " + (input * i));
        }
    }
}
