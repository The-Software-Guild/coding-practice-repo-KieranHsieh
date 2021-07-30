package com.sg.foundations.flowcontrol.whiles;

import java.util.Random;

public class LazyTeenager {
    public static void main(String[] args) {
        int curBound = 1;
        Random rand = new Random();
        do {
            System.out.println("Clean your room!! (x" + curBound + ")");
            if(curBound == 7) {
                System.out.println("THAT'S IT, I'M DOING IT! YOU'RE GROUNDED AND I'M TAKING YOUR XBOX");
                break;
            }
            int cleanChance = rand.nextInt(11);
            if(cleanChance <= curBound) {
                System.out.println("FINE!! I'LL CLEAN MY ROOM. BUT I REFUSE TO EAT MY PEAS");
                break;
            }
            curBound++;
        } while(true);
    }
}
