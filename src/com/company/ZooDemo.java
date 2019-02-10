package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ZooDemo {

    public static void main(String[] args) {

        Scanner numScanner = new Scanner(System.in);
        Scanner textScanner = new Scanner(System.in);
        boolean running;
        String userInput;
        Zoo thePens = new Zoo();
//        Pen newPen = new Pen();

        System.out.println("Welcome ZooKeeper, what would you like to do? \n \n");


        do {
            System.out.println("Main Menu: \n" +
                    "Press [1] Set up a new Pen \n" +
                    "Press [2] Remove a Pen \n" +
                    "Press [3] Add animals to pen \n" +
                    "Press [4] Add BABY animals to pen \n" +
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

                    System.out.println("You just added: " + newPen.getName() + "\n");

                    break;

                case 2:

                    System.out.println("Enter the number of the pen you would like to delete: \n");
                    thePens.viewPens();

                    int userIndex = numScanner.nextInt();
                    thePens.removePen(userIndex);

                    break;

                case 3:

                    System.out.println("Which pen should this big animal be added to?\n");
                    thePens.viewPens();

                    int userPenSelection = numScanner.nextInt();

                    System.out.println("What is the animal's species?");
                    String animalSpecies = textScanner.nextLine();

                    System.out.println("What is the animal's size?");
                    String animalSize = textScanner.nextLine();


                    System.out.println("What is the animal's gender?");
                    String animalGender = textScanner.nextLine();

                    Animal newAnimal = new Animal(animalSpecies, animalSize, animalGender);

                    thePens.getPensArray().get(userPenSelection).addToAnimalsArray(newAnimal);
                    System.out.println(animalSpecies + " has been added to your pen \n");

                    thePens.viewAnimalsInPens();

                    break;

                case 4:
                    System.out.println("Which pen should this baby animal be added to?\n");
                    thePens.viewPens();

                    userPenSelection = numScanner.nextInt();

                    System.out.println("What is the baby animal's species?");
                    String babyAnimalSpecies = textScanner.nextLine();

                    System.out.println("What is the baby animal's size?");
                    String babyAnimalSize = textScanner.nextLine();


                    System.out.println("What is the baby animal's gender?");
                    String babyAnimalGender = textScanner.nextLine();

                    System.out.println("What is the baby animal's age?");
                    String babyAnimalAge = textScanner.nextLine();

                    BabyAnimal newBabyAnimal = new BabyAnimal(babyAnimalSpecies, babyAnimalSize, babyAnimalGender, babyAnimalAge);


                    thePens.getPensArray().get(userPenSelection).addToBabyAnimalsArray(newBabyAnimal);

                    thePens.viewBabyAnimalsInPens();

                    break;

                case 5:

                    System.out.println("Would you like to remove an animal or Baby animal? \n" +
                            "Press [1] Animal \n" +
                            "Press [2] Baby Animal");

                    int menuChoice = textScanner.nextInt();

                    switch (menuChoice) {
                        case 1:
                            System.out.println("Enter the number of the animal you would like to remove: ");
                            thePens.viewAnimalsInPens();

                            userIndex = numScanner.nextInt();

                            thePens.removeAnimal(userIndex);

                            break;

                        case 2:

                            System.out.println("Enter the number of the baby animal you'd like to remove from pen: ");
                            thePens.viewBabyAnimalsInPens();

                            userIndex = numScanner.nextInt();

                            thePens.removeBabyAnimal(userIndex);


                            break;
                    }

                    break;

                case 6: //display all animals in pen

                    thePens.viewAnimalsInPens();

                    break;

                case 7: //display all animals in zoo
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
