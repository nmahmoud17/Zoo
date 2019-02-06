package com.company;

import java.util.ArrayList;
import java.util.List;

public class Pen {
    private List<Animal> animalList = new ArrayList<>();
    private List<BabyAnimal> babyAnimalList = new ArrayList<>();
    private String name;

    public Pen (String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Animal> getAnimalList() {
        return animalList;
    }

    public void setAnimalList(List<Animal> animalList) {
        this.animalList = animalList;
    }

    public List<BabyAnimal> getBabyAnimalList() {
        return babyAnimalList;
    }

    public void setBabyAnimalList(List<BabyAnimal> babyAnimalList) {
        this.babyAnimalList = babyAnimalList;
    }



}
