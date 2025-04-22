package tn.esprit.gestionzoo.entities;

import tn.esprit.gestionzoo.enums.Food;
import tn.esprit.gestionzoo.interfaces.Carnivore;

// Instruction 20
public abstract class Aquatic extends Animal implements Carnivore<Food> {

    public String habitat;

    // Instruction 22
    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }

    // Instruction 37
    public void eatMeat(Food meat) {
        System.out.println(this.name + " is eating meat");
    }

    // Instruction 23
    @Override
    public String toString() {
        return super.toString() + ".\nHabitat: " + habitat;
    }

    // Instruction 24/28
    public abstract void swim();

    // Instruction 31
    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;

        if (obj instanceof Aquatic) {
            Aquatic aq = (Aquatic)obj;
            return aq.name.equals(this.name) && aq.age == this.age && aq.habitat.equals(this.habitat);
        }

        return false;
    }
}