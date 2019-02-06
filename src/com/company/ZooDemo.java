package com.company;

import java.util.Scanner;

public class ZooDemo {

    public static void main(String[] args) {

        Scanner numScanner = new Scanner(System.in);
        Scanner textScanner = new Scanner(System.in);
        Pen myPen = new Pen();


        System.out.println("Welcome ZooKeeper, what would you like to do? \n" +
                "Press [1] Set up a new Pen \n" +
                "Press [2] Remove a Pen \n" +
                "Press [3] Add animals to pen \n" +
                "Press [4] Add baby animals to pen \n" +
                "Press [5] Remove Animals and Baby Animals \n" +
                "Press [6] Display all the Animals in a Pen \n" +
                "Press [7] Display all Animals in the Zoo");

        int MenuChoice = numScanner.nextInt();

        switch(MenuChoice) {

            case 1:
                break;

            case 2:
                break;

            case 3:
                break;

            case 4:
                break;

            case 5:
                break;

            case 6:
                break;

            case 7:
                break;



        }


    }
}
