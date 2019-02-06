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


}
