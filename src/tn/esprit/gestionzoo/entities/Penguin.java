package tn.esprit.gestionzoo.entities;

// Instruction 20
public class Penguin extends Aquatic {

    public float swimmingDepth;

    // Instruction 22
    public Penguin(String family, String name, int age, boolean isMammal, String habitat, float swimmingDepth) {
        super(family, name, age, isMammal, habitat);
        this.swimmingDepth = swimmingDepth;
    }

    // Instruction 23
    @Override
    public String toString() {
        return super.toString() + ".\nSwimming Depth: " + swimmingDepth;
    }

    @Override
    public void swim() {
        System.out.println("This penguin is swimming.");
    }
}
