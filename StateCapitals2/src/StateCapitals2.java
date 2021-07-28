import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class StateCapitals2 {
    private static HashMap<String, String> loadCapitalsFromFile(String fileName) {
        Scanner scanner;
        try {
            scanner = new Scanner(new BufferedReader(new FileReader(fileName)));
        }
        catch(FileNotFoundException e) {
            return new HashMap<>();
        }
        HashMap<String, String> stateCapitalPairs = new HashMap<>();
        String curLine;
        String curCapital;
        while(scanner.hasNextLine()) {
            curLine = scanner.nextLine();
            String[] stateCapitalPair = curLine.split("::");
            stateCapitalPairs.put(stateCapitalPair[0], stateCapitalPair[1]);
        }
        return stateCapitalPairs;
    }
    public static void main(String[] args) {
        HashMap<String, String> capitalPairs = loadCapitalsFromFile("StateCapitals.txt");
        System.out.println(String.format("%d STATES & CAPITALS ARE LOADED.", capitalPairs.size()));
        System.out.println("=======");
        System.out.println("HERE ARE THE STATES");
        ArrayList<String> states = new ArrayList<>(capitalPairs.keySet());
        for(String state : states) {
            System.out.print(state + ", ");
        }
        System.out.println();
        Random rand = new Random();
        int randomState = rand.nextInt(states.size());
        System.out.println(String.format("READY TO TEST YOUR KNOWLEDGE? WHAT IS THE CAPITAL OF '%s'?", states.get(randomState)));
        Scanner input = new Scanner(System.in);
        String answer = input.nextLine();
        if(answer.equals(capitalPairs.get(states.get(randomState)))) {
            System.out.println(String.format("NICE WORK! %s IS CORRECT!", answer));
        }
        else {
            System.out.println(String.format("SORRY, '%s' WAS THE CORRECT ANSWER", capitalPairs.get(states.get(randomState))));
        }
    }
}
