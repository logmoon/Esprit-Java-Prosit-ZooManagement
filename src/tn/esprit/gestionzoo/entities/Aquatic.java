package tn.esprit.gestionzoo.entities;

// Instruction 20
public class Aquatic extends Animal {

    public String habitat;

    // Instruction 22
    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }

    // Instruction 23
    @Override
    public String toString() {
        return super.toString() + ".\nHabitat: " + habitat;
    }

    // Instruction 24
    public void swim() {
        System.out.println("This aquatic animal is swimming.");
    }

}