package tn.esprit.gestionzoo.entities;

import tn.esprit.gestionzoo.enums.Food;
import tn.esprit.gestionzoo.interfaces.Omnivore;

// Instruction 20
public class Terrestrial extends Animal implements Omnivore<Food> {

    public int nbrLegs;

    // Instruction 22
    public Terrestrial(String family, String name, int age, boolean isMammal, int nbrLegs) {
        super(family, name, age, isMammal);
        this.nbrLegs = nbrLegs;
    }

    // Instruction 23
    @Override
    public String toString() {
        return super.toString() + ".\nNumber of legs: " + nbrLegs;
    }

    // Instruction 37
    public void eatMeat(Food meat) {
        System.out.println(this.name + " is eating meat");
    }
    public void eatPlant(Food plant) {
        System.out.println(this.name + " is eating a plant");
    }
    public void eatPlantAndMeat(Food food) {
        System.out.println(this.name + " is eating meat and/or a plant");
    }
}