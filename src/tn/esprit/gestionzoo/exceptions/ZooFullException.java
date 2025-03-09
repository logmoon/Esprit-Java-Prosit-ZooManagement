package tn.esprit.gestionzoo.exceptions;

// Instruction 33
public class ZooFullException extends Exception {
    public ZooFullException() {
        super("The zoo is full, cant add more animals");
    }

    public ZooFullException(String message) {
        super(message);
    }
}
