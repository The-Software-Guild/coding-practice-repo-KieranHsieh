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
    /**
     * Retrieves a int value from the console input.
     * @param scanner The scanner to read user input with.
     * @param prompt The message to prompt the user with.
     * @return The value inputted by the user if it was valid, or 0 if it is not.
     */
    private static int GetConsoleInputInt(Scanner scanner, String prompt) {
        System.out.print(prompt);
        try {
            return scanner.nextInt();
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
        float glassPrice = GetConsoleInputFloat(scanner, "Enter the price of the glass in USD: ");
        float trimPrice = GetConsoleInputFloat(scanner, "Enter the price of trim in USD: ");
        int numWindows = GetConsoleInputInt(scanner, "Enter the number of windows: ");
        float totalCost = 0;
        for(int i = 0; i < numWindows; i ++) {
            Window targetWindow = new Window(width, height, glassPrice, trimPrice);
            totalCost += targetWindow.CalculatePrice();
        }
        Window dummyWindow = new Window(width, height, glassPrice, trimPrice);
        System.out.println(String.format("Window Width = %.2f\n" +
                "Window Height = %.2f" +
                "\nWindow Perimeter = %.2f" +
                "\nWindow Area = %.2f" +
                "\nNumber of Windows = %d" +
                "\nGlass Price = $%.2f" +
                "\nTrim Price = $%.2f" +
                "\nTotal Price = %.2f",
                width, height, dummyWindow.GetPerimeter(), dummyWindow.GetArea(), numWindows, glassPrice, trimPrice, totalCost));
    }
}
