package tn.esprit.gestionzoo.entities;

// Instruction 20
public class Terrestrial extends Animal {

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
}