package tn.esprit.gestionzoo.entities;

// Instruction 20
public class Dolphin extends Aquatic {

    public float swimmingSpeed;

    // Instruction 22
    public Dolphin(String family, String name, int age, boolean isMammal, String habitat, float swimmingSpeed) {
        super(family, name, age, isMammal, habitat);
        this.swimmingSpeed = swimmingSpeed;
    }
    
    // Instruction 23
    @Override
    public String toString() {
        return super.toString() + ".\nSwimming Speed: " + swimmingSpeed;
    }

    // Instruction 24
    @Override
    public void swim() {
        System.out.println("This dolphin is swimming.");
    }
}
