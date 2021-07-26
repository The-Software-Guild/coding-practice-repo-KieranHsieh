package com.sg.foundations.variables;

/**
 * An item on a menu
 */
class MenuItem {
    /**
     * The name of the food item
     */
    public String Name;
    /**
     * The price of the food item in USD
     */
    public float Price;

    /**
     * Constructs a new MenuItem given a name and price
     * @param itemName The name of the item
     * @param itemPrice The price of the item in USD
     */
    public MenuItem(String itemName, float itemPrice) {
        Name = itemName;
        Price = itemPrice;
    }

    /**
     * Converts the item to a string
     * @return The Item as a string
     */
    @Override
    public String toString() {
        return String.format("%10s: $ %5.2f", Name, Price);
    }
}

public class MenuOfChampions {

    public static void main(String[] args) {
        MenuItem pizza = new MenuItem("Pizza", 5.00f);
        MenuItem pasta = new MenuItem("Pasta", 15.00f);
        MenuItem rice = new MenuItem("Rice", 1.00f);
        MenuItem[] items = new MenuItem[3];
        items[0] = pizza;
        items[1] = pasta;
        items[2] = rice;
        System.out.println("Menu:");
        for (MenuItem item: items) {
            System.out.println("\t" + item);
        }
        System.out.println();
    }
}
