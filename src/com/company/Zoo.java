package com.company;

import java.util.List;
import java.util.ArrayList;


public class Zoo {
    private List<Pen> pensArray = new ArrayList<>();

    public List<Pen> getPensArray() {
        return pensArray;
    }

    public void setPensArray(List<Pen> pensArray) {
        this.pensArray = pensArray;
    }

    public void addPen (Pen pen) {
        pensArray.add(pen);

    }

    public void removePen (int indexInput) {
        pensArray.remove(indexInput);
        System.out.println("Your pen has been removed");
    }

    public void viewPens(){
        for (int i = 0; i <pensArray.size() ; i++) {
            System.out.println( "[" +i +"] " + "Pen: " + pensArray.get(i).getName());
        }


        }

    public void viewAnimalsinPens(){
        for (int i = 0; i <pensArray.size() ; i++) {
            System.out.println(pensArray.get(i).getAnimalList());
            System.out.println(pensArray.get(i).getBabyAnimalList());

        }
    }


}
