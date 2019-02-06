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

    public void addToAnimalsArray (Animal animal) {
        animalList.add(animal);

    }

    public void addToBabyAnimalsArray (BabyAnimal babyAnimal) {
        babyAnimalList.add(babyAnimal);
    }

    public void printAnimalArray() {
        for (int i = 0; i < animalList.size(); i++) {
            System.out.println("Animal: "+"["+i+"]\n"  + "Species:" + animalList.get(i).getSpecies() + "\n"
            + "Size: " + animalList.get(i).getSize() + "\n" +
                    "Gender: " + animalList.get(i).getGender());
        }
    }

    public void printBabyAnimalArray() {
        for (int i = 0; i < babyAnimalList.size(); i++) {
            System.out.println("Animal: " + "[" + i + "]\n" + "Species:" + babyAnimalList.get(i).getSpecies() + "\n"
                    + "Size: " + babyAnimalList.get(i).getSize() + "\n" +
                    "Gender: " + babyAnimalList.get(i).getGender());
        }
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
