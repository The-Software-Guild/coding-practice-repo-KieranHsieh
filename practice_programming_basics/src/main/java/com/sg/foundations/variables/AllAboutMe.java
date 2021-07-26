package com.sg.foundations.variables;

public class AllAboutMe {
    public static void main(String[] args) {
        String name = "Kieran";
        String favoriteFood = "Pasta";
        int numPets = 1;
        String livingArrangement = "Apartment";
        boolean canWhistle = true;
        System.out.println("My name is " + name + ".");
        System.out.println("My favorite food is " + favoriteFood + ".");
        System.out.println("I have " + numPets + " pets.");
        System.out.println("I live in a " + livingArrangement + ", and I love it here");
        System.out.println("It's true I " + (canWhistle ? "know" : "don't know") + " how to whistle.");
    }
}
