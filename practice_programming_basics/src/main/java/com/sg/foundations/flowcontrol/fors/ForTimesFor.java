package com.sg.foundations.flowcontrol.fors;

import java.util.Scanner;

public class ForTimesFor {
    public static void main(String[] args) {
        System.out.print("Which times table shall I recite? ");
        Scanner scanner = new Scanner(System.in);
        int numCorrect = 0;
        int input = Integer.parseInt(scanner.nextLine());
        for(int i = 1; i <= 5; i ++) {
            System.out.print(i + " * " + input + " = ");
            Scanner num = new Scanner(System.in);
            int answer = num.nextInt();
            if(answer == (i * input)) {
                System.out.println("Correct");
                numCorrect++;
            }
            else {
                System.out.println("Sorry no, the answer is: " + (i * input));
            }
        }
        System.out.println("You got " + numCorrect + " correct");
    }
}
