import java.util.HashMap;

public class StateCapitals1 {
    public static void main(String[] args) {
        HashMap<String, String> stateCapitalPairs = new HashMap<>();
        stateCapitalPairs.put("Alabama", "Montgomery");
        stateCapitalPairs.put("Alaska", "Juneau");
        stateCapitalPairs.put("Arizona", "Phoenix");
        stateCapitalPairs.put("Arkansas", "Little Rock");
        stateCapitalPairs.put("California", "Sacramento");
        stateCapitalPairs.put("Colorado", "Denver");
        stateCapitalPairs.put("Connecticut", "Hartford");
        stateCapitalPairs.put("Delaware", "Dover");
        stateCapitalPairs.put("Florida", "Tallahassee");
        stateCapitalPairs.put("Georgia", "Atlanta");
        stateCapitalPairs.put("Hawaii", "Honolulu");
        stateCapitalPairs.put("Idaho", "Boise");
        stateCapitalPairs.put("Illinois", "Springfield");
        stateCapitalPairs.put("Indiana", "Indianapolis");
        stateCapitalPairs.put("Iowa", "Des Moines");
        stateCapitalPairs.put("Kansas", "Topeka");
        stateCapitalPairs.put("Kentucky", "Frankfort");
        stateCapitalPairs.put("Louisiana", "Baton Rouge");
        stateCapitalPairs.put("Maine", "Augusta");
        stateCapitalPairs.put("Maryland", "Annapolis");
        stateCapitalPairs.put("Massachusetts", "Boston");
        stateCapitalPairs.put("Michigan", "Lansing");
        stateCapitalPairs.put("Minnesota", "Saint Paul");
        stateCapitalPairs.put("Mississippi", "Jackson");
        stateCapitalPairs.put("Missouri", "Jefferson City");
        stateCapitalPairs.put("Montana", "Helena");
        stateCapitalPairs.put("Nebraska", "Lincoln");
        stateCapitalPairs.put("Nevada", "Carson City");
        stateCapitalPairs.put("New Hampshire", "Concord");
        stateCapitalPairs.put("New Jersey", "Trenton");
        stateCapitalPairs.put("New Mexico", "Santa Fe");
        stateCapitalPairs.put("New York", "Albany");
        stateCapitalPairs.put("North Carolina", "Raleigh");
        stateCapitalPairs.put("North Dakota", "Bismarck");
        stateCapitalPairs.put("Ohio", "Columbus");
        stateCapitalPairs.put("Oklahoma", "Oklahoma City");
        stateCapitalPairs.put("Oregon", "Salem");
        stateCapitalPairs.put("Pennsylvania", "Harrisburg");
        stateCapitalPairs.put("Rhode Island", "Providence");
        stateCapitalPairs.put("South Carolina", "Columbia");
        stateCapitalPairs.put("South Dakota", "Pierre");
        stateCapitalPairs.put("Tennessee", "Nashville");
        stateCapitalPairs.put("Texas", "Austin");
        stateCapitalPairs.put("Utah", "Salt Lake City");
        stateCapitalPairs.put("Vermont", "Montpelier");
        stateCapitalPairs.put("Virginia", "Richmond");
        stateCapitalPairs.put("Washington", "Olympia");
        stateCapitalPairs.put("West Virginia", "Charleston");
        stateCapitalPairs.put("Wisconsin", "Madison");
        stateCapitalPairs.put("Wyoming", "Cheyenne");
        System.out.println("STATES");
        System.out.println("======");
        for(String stateName : stateCapitalPairs.keySet()) {
            System.out.println(stateName);
        }
        System.out.println("CAPITALS");
        System.out.println("========");
        for(String capitalName : stateCapitalPairs.values()) {
            System.out.println(capitalName);
        }
        System.out.println("STATE/CAPITAL PAIRS");
        System.out.println("===================");
        for(String stateName : stateCapitalPairs.keySet()) {
            System.out.println(String.format("%-20s - %-20s", stateName, stateCapitalPairs.get(stateName)));
        }
    }
}
