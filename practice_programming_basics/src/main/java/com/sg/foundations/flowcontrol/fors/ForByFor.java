package com.sg.foundations.flowcontrol.fors;

public class ForByFor {
    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {
            System.out.print("|");

            for (int j = 0; j < 3; j++) {
                String output = "*";
                if(j == 1 && i == 1) {
                    output = "#";
                }
                else if(j == 1) {
                    output = "$";
                }
                else if(i == 1) {
                    output = "@";
                }
                for (int k = 0; k < 3; k++) {
                    System.out.print(output);
                }
                System.out.print("|");
            }
        }
    }
}
