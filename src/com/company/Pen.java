package com.company;

import java.util.ArrayList;
import java.util.List;

public class Pen {
    List<Animal> animalList = new ArrayList<>();
    List<BabyAnimal> babyAnimalList = new ArrayList<>();

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
