package com.sg.foundations.flowcontrol.fors;

import java.util.Scanner;

public class TraditionalFizzBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int curCount = 0;
        int curIdx = 0;
        while(curCount < input) {
            if(curIdx != 0) {
                if(curIdx % 5 == 0 && curIdx % 3 == 0) {
                    System.out.println("fizzbuzz");
                    curCount++;
                }
                else if(curIdx % 5 == 0) {
                    System.out.println("buzz");
                    curCount++;
                }
                else if(curIdx % 3 == 0) {
                    System.out.println("fizz");
                    curCount++;
                }
                else {
                    System.out.println(curIdx);
                }
            }
            curIdx++;
        }
    }
}
