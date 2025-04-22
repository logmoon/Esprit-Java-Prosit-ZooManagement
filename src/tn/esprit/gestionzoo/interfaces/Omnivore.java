package tn.esprit.gestionzoo.interfaces;

// Instruction 35
public interface Omnivore<T> extends Carnivore<T>, Herbivore<T>  {
    public void eatPlantAndMeat(T food);
}
