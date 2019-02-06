package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ZooDemo {

    public static void main(String[] args) {

        Scanner numScanner = new Scanner(System.in);
        Scanner textScanner = new Scanner(System.in);
        boolean running;
        String userInput;
        Zoo thePens = new Zoo();


        do {
            System.out.println("Welcome ZooKeeper, what would you like to do? \n \n" +
                    "Press [1] Set up a new Pen \n" +
                    "Press [2] Remove a Pen \n" +
                    "Press [3] Add animals to pen \n" +
                    "Press [4] Add baby animals to pen \n" +
                    "Press [5] Remove Animals and Baby Animals \n" +
                    "Press [6] Display all the Animals in a Pen \n" +
                    "Press [7] Display all Animals in the Zoo");

            int MenuChoice = numScanner.nextInt();

            switch (MenuChoice) {

                case 1:

                    System.out.println("What is the type of pen? ");
                    userInput = textScanner.nextLine();

                    Pen newPen = new Pen(userInput);
                    thePens.addPen(newPen);

                    System.out.println("You just added: " + newPen.getName());

                    break;

                case 2:

                    System.out.println("Enter the number of the pen you would like to delete: \n");
                    thePens.viewPens();

                    int userIndex = numScanner.nextInt();
                    thePens.removePen(userIndex);

                    break;

                case 3:
                    System.out.println("Pen name: ");
                    userInput = textScanner.nextLine();

                    Pen existingPen = new Pen(userInput);

                    System.out.println("What is the animal's species?");
                    String animalSpecies = textScanner.nextLine();

                    System.out.println("What is the animal's size?");
                    String animalSize = textScanner.nextLine();


                    System.out.println("What is the animal's gender?");
                    String animalGender = textScanner.nextLine();

                    Animal newAnimal = new Animal(animalSpecies, animalSize, animalGender);


                    break;

                case 4:
                    System.out.println("What is the baby animal's species?");
                    String babyAnimalSpecies = textScanner.nextLine();

                    System.out.println("What is the baby animal's size?");
                    String babyAnimalSize = textScanner.nextLine();


                    System.out.println("What is the baby animal's gender?");
                    String babyAnimalGender = textScanner.nextLine();

                    System.out.println("What is the baby animal's age?");
                    String babyAnimalAge = textScanner.nextLine();

                    BabyAnimal newBabyAnimal = new BabyAnimal(babyAnimalSpecies, babyAnimalSize, babyAnimalGender, babyAnimalAge);
//                    newPen.babyAnimalList.add(newBabyAnimal);

                    break;

                case 5:

                    break;

                case 6: //display all animals in pen

                    thePens.viewAnimalsinPens();

                    break;

                case 7:
                    break;


            }

            System.out.println("Would you like to go to main menu? \n" +
                    "Press [1] Main Menu \n" +
                    "Press [2] Exit");
            userInput = textScanner.nextLine();

            if (userInput.equalsIgnoreCase("1")){
                running = true;
            } else if (userInput.equalsIgnoreCase("2")){
                running = false;
            }else {
                System.out.println("Make sure to enter a number: ");
                running = true;
            }

        }while (running);


    }
}
