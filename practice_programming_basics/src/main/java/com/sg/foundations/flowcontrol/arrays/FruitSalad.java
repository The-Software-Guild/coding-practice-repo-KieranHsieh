package com.sg.foundations.flowcontrol.arrays;

public class FruitSalad {
    public static void main(String[] args) {
        String[] fruits = {"Kiwi Fruit", "Gala Apple", "Granny Smith Apple", "Cherry Tomato", "Gooseberry", "Beefsteak Tomato", "Braeburn Apple", "Blueberry", "Strawberry", "Navel Orange", "Pink Pearl Apple",  "Raspberry", "Blood Orange", "Sungold Tomato", "Fuji Apple", "Blackberry", "Banana", "Pineapple", "Florida Orange", "Kiku Apple", "Mango", "Satsuma Orange", "Watermelon", "Snozzberry"};

        String[] fruitSalad;

        // Code Recipe for fruit salad should go here!
        int numBerries = 0;
        int numApples = 0;
        int numOranges = 0;
        int totalNumFruits = 0;
        for(String fruit : fruits) {
            if(totalNumFruits >= 12) {
                break;
            }
            if(numBerries < 12 && fruit.contains("berry")) {
                numBerries++;
                totalNumFruits++;
            }
            else if(numApples < 3 && fruit.contains("Apple")) {
                numApples++;
                totalNumFruits++;
            }
            else if(numOranges < 2 && fruit.contains("Orange")) {
                numOranges++;
                totalNumFruits++;
            }
        }
        System.out.println(totalNumFruits + " fruits");
        System.out.println(numBerries + " berries");
        System.out.println(numApples + " apples");
        System.out.println(numOranges + " oranges");
    }
}
