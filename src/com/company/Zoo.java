package com.company;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;


public class Zoo {
    private List<Pen> pensArray = new ArrayList<>();

    public List<Pen> getPensArray() {
        return pensArray;
    }

    public void setPensArray(List<Pen> pensArray) {
        this.pensArray = pensArray;
    }

    public void addPen(Pen pen) {
        pensArray.add(pen);

    }

    public void removePen(int indexInput) {
        pensArray.remove(indexInput);
        System.out.println("Your pen has been removed");
    }

    public void viewPens() {
        for (int i = 0; i < pensArray.size(); i++) {
            System.out.println("[" + i + "] " + "Pen: " + pensArray.get(i).getName());
        }


    }

    //need to figure out how to not print if no animals

    public void viewAnimalsInPens() {
        for (int i = 0; i < pensArray.size(); i++) {
            if (!pensArray.isEmpty()) {
                pensArray.get(i).printAnimalArray();
            } else {
                System.out.println("No animals here!");
            }
        }
    }

    public void removeAnimal(int userInput) {
        for (int i = 0; i < pensArray.size() ; i++) {
            pensArray.get(i).removeAnimal(userInput);
        }
    }

    public void viewBabyAnimalsInPens() {

        for (int i = 0; i < pensArray.size(); i++) {
            System.out.println("Here are your baby animals in the pen: \n");
            pensArray.get(i).printBabyAnimalArray();
            break;
        }
    }

}






