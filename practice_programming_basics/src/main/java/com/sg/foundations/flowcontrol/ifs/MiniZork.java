package com.sg.foundations.flowcontrol.ifs;

import java.util.Scanner;

interface ILocation {
    void Go(Scanner userInput);
    String GetActionString();
}

class Basement implements ILocation {

    @Override
    public void Go(Scanner userInput) {
        System.out.println("You are in the basement");
        System.out.println("You see stairs back to the house (go upstairs)");
        System.out.println("You can look around (look around)");
        String action = userInput.nextLine();
        if(action.equals("go upstairs")) {
            ILocation house = new House();
            house.Go(userInput);
        }
        else if(action.equals("look around")) {
            System.out.println("You found an old ladder");
        }
    }

    @Override
    public String GetActionString() {
        return "go to the basement";
    }
}

class Attic implements ILocation {

    @Override
    public void Go(Scanner userInput) {
        System.out.println("You are in the attic");
        System.out.println("You see stairs back to the house (go downstairs)");
        System.out.println("You can look around (look around)");
        String action = userInput.nextLine();
        if(action.equals("go downstairs")) {
            ILocation house = new House();
            house.Go(userInput);
        }
        else if(action.equals("look around")) {
            System.out.println("You found an old box");
        }
    }

    @Override
    public String GetActionString() {
        return "go to the attic";
    }
}

class House implements ILocation {

    @Override
    public void Go(Scanner userInput) {
        System.out.println("You are inside the house");
        System.out.println("You see a basement (go to the basement)");
        System.out.println("You see an attic (go to the attic)");
        String action = userInput.nextLine();
        ILocation basement = new Basement();
        ILocation attic = new Attic();
        if(action.equals(basement.GetActionString())) {
            basement.Go(userInput);
        }
        else if(action.equals(attic.GetActionString())) {
            attic.Go(userInput);
        }
    }

    @Override
    public String GetActionString() {
        return "go to the house";
    }
}

public class MiniZork {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("You are standing in a house");
        ILocation house = new House();
        house.Go(userInput);

    }
}
