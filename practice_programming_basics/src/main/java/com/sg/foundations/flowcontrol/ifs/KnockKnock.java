package com.sg.foundations.flowcontrol.ifs;

import java.util.Scanner;

public class KnockKnock {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);

        System.out.print("Knock Knock! Guess who!! ");
        String nameGuess = inputReader.nextLine();

        // The .equals function will compare the two strings by value,
        // while the == operator will compare the strings by memory address
        if(nameGuess.equals("Marty McFly")){
            System.out.println("Hey! That's right! I'm back!");
            System.out.println(".... from the Future."); // Sorry, had to!
        }else{
            System.out.println("Dude, do I -look- like " + nameGuess);
        }
    }
}
