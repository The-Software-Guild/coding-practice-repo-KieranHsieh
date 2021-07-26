package com.mthree.window_master;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class WindowMaster {
    /**
     * Retrieves a float value from the console input.
     * @param scanner The scanner to read user input with.
     * @param prompt The message to prompt the user with.
     * @return The value inputted by the user if it was valid, or 0 if it is not.
     */
    private static float GetConsoleInputFloat(Scanner scanner, String prompt) {
        System.out.print(prompt);
        try {
            return scanner.nextFloat();
        }
        catch(NoSuchElementException e) {
            System.out.println("Failed to parse integer: " + e.getMessage());
        }
        catch(IllegalStateException e) {
            System.out.println("The scanner was closed");
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float width = GetConsoleInputFloat(scanner, "Enter the width of the window: ");
        float height = GetConsoleInputFloat(scanner, "Enter the height of the window: ");
        Window targetWindow = new Window(width, height);
        System.out.println(targetWindow);
    }
}
