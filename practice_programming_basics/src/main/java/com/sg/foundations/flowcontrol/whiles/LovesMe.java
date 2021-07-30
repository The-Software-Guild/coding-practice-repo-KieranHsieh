package com.sg.foundations.flowcontrol.whiles;

import java.util.Random;

public class LovesMe {
    public static void main(String[] args) {
        Random rand = new Random();
        int numPetals = rand.nextInt(89 - 13 + 1) + 13;
        int curCount = 0;
        System.out.println(numPetals);
        while(curCount < numPetals) {
            String msg = curCount % 2 == 0 ? "It loves me NOT!" : "It LOVES me!";
            curCount++;
            System.out.println(msg);
        }
    }
}
