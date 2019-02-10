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


    public void removeAnimal(int userInput) {
        for (int i = 0; i <animalList.size(); i++) {
            animalList.remove(userInput);
        }
    }

    public void removeBabyAnimal(int userInput) {
        for (int i =0; i <animalList.size(); i++) {
            babyAnimalList.remove(userInput);
        }
    }


    public void printAnimalArray() {
        for (int i = 0; i < animalList.size(); i++) {

            if (animalList.isEmpty()) {
                System.out.println("There are no animals in this pen");}
            else {
                System.out.println("Animal: " + "[" + i + "]\n" + "Species:" + animalList.get(i).getSpecies() + "\n"
                        + "Size: " + animalList.get(i).getSize() + "\n" +
                        "Gender: " + animalList.get(i).getGender() +"\n");
            }
        }
    }

    public void printBabyAnimalArray() {
        for (int i = 0; i < babyAnimalList.size(); i++) {

            if (babyAnimalList.isEmpty()) {
                System.out.println("There are no baby animals here!");
            }
            System.out.println("Animal: " + "[" + i + "]\n" + "Species:" + babyAnimalList.get(i).getSpecies() + "\n"
                    + "Size: " + babyAnimalList.get(i).getSize() + "\n" +
                    "Gender: " + babyAnimalList.get(i).getGender() + "\n");

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
