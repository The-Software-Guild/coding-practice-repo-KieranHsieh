import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.*;
import java.util.function.Function;

public class StateCapitalsApp {
    private static HashMap<String, Capital> loadCapitals(String fileName) {
        Scanner scanner;
        try {
            scanner = new Scanner(new BufferedReader(new FileReader(fileName)));
        }
        catch(IOException e) {
            System.out.println(e.getMessage());
            return new HashMap<>();
        }
        HashMap<String, Capital> ret = new HashMap<>();
        String curLine;
        Capital curCapital;
        while(scanner.hasNextLine()) {
            curLine = scanner.nextLine();
            String[] tokens = curLine.split(Capital.DELIMITER);
            curCapital = Capital.CreateFromTokens(tokens);
            ret.put(tokens[0], curCapital);
        }
        return ret;
    }

    public static void main(String[] args) {
        HashMap<String, Capital> capitals = loadCapitals("MoreStateCapitals.txt");
        System.out.println(String.format("%d STATE/CAPITAL PAIRS LOADED", capitals.size()));
        System.out.println("=======================================================================");
        for(String state : capitals.keySet()) {
            Capital curCapital = capitals.get(state);
            String outStr = String.format("%15s - %s",
                    state, curCapital.toString());
            System.out.println(outStr);
        }
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the lower limit for capital city population: ");
        long popMin = input.nextLong();
        input.nextLine();
        System.out.println(String.format("LISTING CAPITALS WITH POPULATION GREATER THAN %d\n", popMin));
        for(String state : capitals.keySet()) {
            Capital curCapital = capitals.get(state);
            if(curCapital.getPopulation() > popMin) {
                String outStr = String.format("%15s - %s",
                        state, curCapital.toString());
                System.out.println(outStr);
            }
        }
        System.out.print("Please enter the upper limit for capital city sq mileage: ");
        double areaLimit = input.nextDouble();
        input.nextLine();
        System.out.println();
        System.out.println(String.format("LISTING CAPITALS WITH AREAS LESS THAN %.2f", areaLimit));
        for(String state : capitals.keySet()) {
            Capital curCapital = capitals.get(state);
            if(curCapital.getSquareMileage() < areaLimit) {
                String outStr = String.format("%15s - %s",
                        state, curCapital.toString());
                System.out.println(outStr);
            }
        }
    }
}
