package com.sg.foundations.flowcontrol.fors;

public class SpringForwardFallBack {
    public static void main(String[] args) {

        System.out.println("It's Spring...!");
        // From 0 to 9
        for (int i = 0; i < 10; i++) {
            System.out.print(i + ", ");
        }
        // From 10 to 1
        System.out.println("\nOh no, it's fall...");
        for (int i = 9; i > -1; i--) {
            System.out.print(i + ", ");
        }
    }
}
