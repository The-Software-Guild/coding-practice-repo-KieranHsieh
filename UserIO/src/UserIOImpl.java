import java.util.NoSuchElementException;
import java.util.Scanner;

@FunctionalInterface
interface InputQuery<T> {
    T method(Scanner scanner);
}

public class UserIOImpl implements UserIO {
    public void print(String message) {
        System.out.println(message);
    }

    public String readString(String prompt) {
        System.out.print(prompt);
        return getUserInput(Scanner::nextLine, "");
    }

    public int readInt(String prompt) {
        System.out.print(prompt);
        return getUserInput(Scanner::nextInt, -1);
    }

    public int readInt(String prompt, int min, int max) {
        System.out.print(prompt);
        int value;
        do {
            value = getUserInput(Scanner::nextInt, min - 1);
            if(value < min || value > max) {
                value = min-1;
            }
        }
        while(value == min-1);
        return value;
    }

    public double readDouble(String prompt) {
        System.out.print(prompt);
        return getUserInput(Scanner::nextDouble, -1.0);
    }

    public double readDouble(String prompt, double min, double max) {
        System.out.print(prompt);
        double value;
        do {
            value = getUserInput(Scanner::nextDouble, min - 1);
            if(value < min || value > max) {
                value = min-1;
            }
        }
        while(value == min-1);
        return value;
    }

    public float readFloat(String prompt) {
        System.out.print(prompt);
        return getUserInput(Scanner::nextFloat, -1.0f);
    }

    public float readFloat(String prompt, float min, float max) {
        System.out.print(prompt);
        float value;
        do {
            value = getUserInput(Scanner::nextFloat, min - 1);
            if(value < min || value > max) {
                value = min-1;
            }
        }
        while(value == min-1);
        return value;
    }

    public long readLong(String prompt) {
        System.out.print(prompt);
        return getUserInput(Scanner::nextLong, -1L);
    }

    public long readLong(String prompt, long min, long max) {
        System.out.print(prompt);
        long value;
        do {
            value = getUserInput(Scanner::nextLong, min - 1);
            if(value < min || value > max) {
                value = min-1;
            }
        }
        while(value == min-1);
        return value;
    }
    private <T> T getUserInput(InputQuery<T> query, T defaultValue) {
        try {
            return getUserInput(query);
        }
        catch (UserIOException e) {
            return defaultValue;
        }
    }
    private <T> T getUserInput(InputQuery<T> query) throws UserIOException {
        Scanner scanner = new Scanner(System.in);
        try {
            return query.method(scanner);
        }
        catch(IllegalStateException | NoSuchElementException e) {
            throw new UserIOException("Invalid user input");
        }
    }
}
