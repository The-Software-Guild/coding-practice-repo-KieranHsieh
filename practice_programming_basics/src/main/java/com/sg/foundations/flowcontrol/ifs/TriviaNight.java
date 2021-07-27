package com.sg.foundations.flowcontrol.ifs;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TriviaNight {
    private static final char[] ANSWERS = {
        'A', 'B', 'C', 'D'
    };
    private static Scanner InputScanner = new Scanner(System.in);
    private static boolean AskQuestion(String question, int answerIdx, String[] choices) {
        System.out.println(question);
        for(int i = 0; i < choices.length; i++) {
            System.out.println((char)('A' + i) + ") " + choices[i]);
        }
        String choice = InputScanner.nextLine();
        if(choice.length() != 1) {
            System.out.println("Invalid choice, your choice must be a single letter a-z");
            return false;
        }
        return ANSWERS[answerIdx] == Character.toUpperCase(choice.charAt(0));
    }
    public static void main(String[] args) {
        int totalCorrect = 0;
        boolean q1Right = AskQuestion("What is the lowest level programming language?", 3, new String[]{
                "Source Code",
                "Assembly Language",
                "C#",
                "Machine Code"
        });
        if(q1Right) { totalCorrect++; }
        boolean q2Right = AskQuestion("Website Security CAPTCHA Forms Are Descended From the Work of?", 1, new String[]{
                "Grace Hopper",
                "Alan Turing",
                "Charles Babbage",
                "Larry Page"
        });
        if(q2Right) { totalCorrect++; }
        boolean q3Right = AskQuestion("Which of These Sci-Fi Ships Was Once Slated for a Full-Size Replica in Las Vegas?", 2, new String[]{
                "Serenity",
                "The Battlestar Galactica",
                "The USS Enterprise",
                "The Millenium Falcon"
        });
        if(q3Right) { totalCorrect++; }
        if(totalCorrect > 0) {
            System.out.println("Good job! You got " + totalCorrect + " correct answers");
        }
        else {
            System.out.print("You didn't get any correct");
        }
    }
}
