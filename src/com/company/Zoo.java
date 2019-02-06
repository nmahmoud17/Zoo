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
        System.out.println("New pen: "+ pen);

    }

    public void removePen (Pen pen) {
        pensArray.remove(pen);
        System.out.println("Your " + pen + "has been removed");
    }

    public void viewPens(){
        for (int i = 0; i <pensArray.size() ; i++) {
            System.out.println(pensArray.get(i));
        }


        }

    public void viewAnimalsinPens(){
        for (int i = 0; i <pensArray.size() ; i++) {
            System.out.println(pensArray.get(i).getAnimalList());
            System.out.println(pensArray.get(i).getBabyAnimalList());

        }
    }


}
