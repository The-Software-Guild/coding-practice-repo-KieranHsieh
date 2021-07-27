package com.sg.foundations.flowcontrol.ifs;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BirthStones {
    private static final String[] MONTH_IDXS = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    private static final Map<String, String> BIRTHSTONE_MAP = Stream.of(new String[][] {
            {MONTH_IDXS[0],     "Garnet"},
            {MONTH_IDXS[1],     "Amethyst"},
            {MONTH_IDXS[2],     "Aquamarine"},
            {MONTH_IDXS[3],     "Diamond"},
            {MONTH_IDXS[4],     "Emerald"},
            {MONTH_IDXS[5],     "Pearl"},
            {MONTH_IDXS[6],     "Ruby"},
            {MONTH_IDXS[7],     "Peridot"},
            {MONTH_IDXS[8],     "Sapphire"},
            {MONTH_IDXS[9],     "Opal"},
            {MONTH_IDXS[10],    "Topaz"},
            {MONTH_IDXS[11],    "Turquoise"},
    }).collect(Collectors.toMap(data -> data[0], data -> data[1]));
    private static Scanner InputScanner = new Scanner(System.in);
    private static int PromptForIntegerInput(String prompt) {
        System.out.print(prompt);
        try {
            return InputScanner.nextInt();
        }
        catch(NoSuchElementException | IllegalStateException e) {
            System.out.print(e.getMessage());
        }
        return -1;
    }
    public static void main(String[] args) {
        int month = PromptForIntegerInput("What month were you born? (1 - 12): ");
        if(month < 1 || month > 12) {
            System.out.println("Inputted month must be between 1 and 12");
            return;
        }
        System.out.println(MONTH_IDXS[month - 1] + "'s birthstone is " + BIRTHSTONE_MAP.get(MONTH_IDXS[month - 1]));
    }
}
