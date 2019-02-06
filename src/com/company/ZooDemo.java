package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ZooDemo {

    public static void main(String[] args) {

        Scanner numScanner = new Scanner(System.in);
        Scanner textScanner = new Scanner(System.in);

        System.out.println("Welcome ZooKeeper, what would you like to do? \n \n" +
                "Press [1] Set up a new Pen \n" +
                "Press [2] Remove a Pen \n" +
                "Press [3] Add animals to pen \n" +
                "Press [4] Add baby animals to pen \n" +
                "Press [5] Remove Animals and Baby Animals \n" +
                "Press [6] Display all the Animals in a Pen \n" +
                "Press [7] Display all Animals in the Zoo");

        int MenuChoice = numScanner.nextInt();
        Pen pen = new Pen();
        Zoo zoo = new Zoo();

        switch(MenuChoice) {

            case 1:

                System.out.println("Please enter the type of pen you would like to create: \n" +
                        "Press [1] for large Animals \n" +
                        "Press [2] for baby Animals \n");

                int menuChoice2 = numScanner.nextInt();
                switch (menuChoice2) {

                    case 1:

                        pen.getAnimalList();



                        break;

                    case 2:

                        pen.getBabyAnimalList();
                        break;

                }

                break;

            case 2:
                break;

            case 3:
                System.out.println("What is the animal's species?");
                String animalSpecies = textScanner.nextLine();

                System.out.println("What is the animal's size?");
                String animalSize = textScanner.nextLine();


                System.out.println("What is the animal's gender?");
                String animalGender = textScanner.nextLine();

                Animal newAnimal = new Animal(animalSpecies, animalSize, animalGender);
                pen.animalList.add(newAnimal);

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
                pen.babyAnimalList.add(newBabyAnimal);

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
