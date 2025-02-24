package tn.esprit.gestionzoo.entities;

// Instruction 20
public abstract class Aquatic extends Animal {

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