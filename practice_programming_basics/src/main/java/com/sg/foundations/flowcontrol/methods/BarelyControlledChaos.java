package com.sg.foundations.flowcontrol.methods;

import javafx.animation.AnimationTimer;

import java.util.Random;

public class BarelyControlledChaos {
    public static void main(String[] args) {
        Random rand = new Random();
        String color = chooseColor(rand); // call color method here
        String animal = chooseAnimal(rand); // call animal method again here
        String colorAgain = chooseColor(rand); // call color method again here
        int weight = chooseNumber(rand, 5, 200); // call number method,
        // with a range between 5 - 200
        int distance = chooseNumber(rand, 10, 20); // call number method,
        // with a range between 10 - 20
        int number = chooseNumber(rand, 10000, 20000); // call number method,
        // with a range between 10000 - 20000
        int time = chooseNumber(rand, 2, 6); // call number method,
        // with a range between 2 - 6

        System.out.println("Once, when I was very small...");

        System.out.println("I was chased by a " + color + ", "
                + weight + "lb " + " miniature " + animal
                + " for over " + distance + " miles!!");

        System.out.println("I had to hide in a field of over "
                + number + " " + colorAgain + " poppies for nearly "
                + time + " hours until it left me alone!");

        System.out.println("\nIt was QUITE the experience, "
                + "let me tell you!");
    }

    private static String chooseColor(Random rand) {
        String[] COLORS = { "RED", "ORANGE", "YELLOW", "GREEN", "BLUE" };
        int colorIdx = rand.nextInt(COLORS.length);
        return COLORS[colorIdx];
    }
    private static String chooseAnimal(Random rand) {
        String[] ANIMALS = {"LION", "BEAR", "FROG", "WORM", "HORSE"};
        int animalIdx = rand.nextInt(ANIMALS.length);
        return ANIMALS[animalIdx];
    }
    private static int chooseNumber(Random rand, int min, int max) {
        return rand.nextInt(max - min + 1) + min;
    }
    // ??? Method 2 ???
    // ??? Method 3 ???
}
