package com.sg.classroster.ui;

import java.util.NoSuchElementException;
import java.util.Scanner;

@FunctionalInterface
interface ScanFnc<T> {
    T method(Scanner scanner);
}

public class UserIOConsoleImpl implements UserIO {
    public void print(String msg) {
        System.out.println(msg);
    }

    public double readDouble(String prompt) {
        System.out.print(prompt);
        return readValue(Scanner::nextDouble, 0.0);
    }

    public double readDouble(String prompt, double min, double max) {
        double retVal;
        do {
            System.out.print(prompt);
            retVal = readValue(Scanner::nextDouble, min - 1);
        }
        while(retVal < min || retVal > max);
        return retVal;
    }

    public float readFloat(String prompt) {
        System.out.print(prompt);
        return readValue(Scanner::nextFloat, 0.0f);
    }

    public float readFloat(String prompt, float min, float max) {
        float retVal;
        do {
            System.out.print(prompt);
            retVal = readValue(Scanner::nextFloat, min - 1);
        }
        while(retVal < min || retVal > max);
        return retVal;
    }

    public int readInt(String prompt) {
        System.out.print(prompt);
        return readValue(Scanner::nextInt, 0);
    }

    public int readInt(String prompt, int min, int max) {
        int retVal;
        do {
            System.out.print(prompt);
            retVal = readValue(Scanner::nextInt, min - 1);
        }
        while(retVal < min || retVal > max);
        return retVal;
    }

    public long readLong(String prompt) {
        System.out.print(prompt);
        return readValue(Scanner::nextLong, 0L);
    }

    public long readLong(String prompt, long min, long max) {
        long retVal;
        do {
            System.out.print(prompt);
            retVal = readValue(Scanner::nextLong, min - 1);
        }
        while(retVal < min || retVal > max);
        return retVal;
    }

    public String readString(String prompt) {
        System.out.print(prompt);
        return readValue(Scanner::nextLine, "");
    }
    private <T> T readValue(ScanFnc<T> fnc, T defaultValue) {
        Scanner scanner = new Scanner(System.in);
        try {
            return fnc.method(scanner);
        }
        catch(IllegalStateException | NoSuchElementException e) {
            return defaultValue;
        }
    }
}
