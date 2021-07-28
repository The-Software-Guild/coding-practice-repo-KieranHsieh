package com.sg.foundations.flowcontrol.random;

import java.util.Random;

public class CoinFlipper {
    public static void main(String[] args) {
        System.out.println("Ready, Set, Flip, ...");
        Random rand = new Random();
        boolean isHeads = rand.nextBoolean();
        if(isHeads) {
            System.out.println("You got HEADS!");
        }
        else {
            System.out.println("You got TAILS!");
        }
    }
}
