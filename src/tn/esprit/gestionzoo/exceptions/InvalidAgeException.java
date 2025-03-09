package tn.esprit.gestionzoo.exceptions;
import tn.esprit.gestionzoo.entities.Animal;

// Instruction 34
public class InvalidAgeException extends Exception {
    public InvalidAgeException() {
        super("Invalid age for animal, cant add it...");
    }

    public InvalidAgeException(String message) {
        super(message);
    }

    // AMEN:
    // Custom constructor, we pass in the animal itself for better information
    public InvalidAgeException(Animal animal) {
        super("Invalid age for animal: \"" + animal.getName() + "\". Can't add it...");
    }
}