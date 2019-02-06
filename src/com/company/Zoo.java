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

    public void viewAnimalsInPens() {
        for (int i = 0; i < pensArray.size(); i++) {
            if (pensArray.get(i).getAnimalList().isEmpty()) {
                System.out.println("No animals");
            }
            System.out.println(pensArray.get(i).getAnimalList().get(i).getSpecies());

        }
    }

    public void viewBabyAnimalsInPens() {

        for (int i = 0; i < pensArray.size(); i++) {
            System.out.println(pensArray.get(i).getBabyAnimalList().get(i).getSpecies());
            break;
        }
    }

}






