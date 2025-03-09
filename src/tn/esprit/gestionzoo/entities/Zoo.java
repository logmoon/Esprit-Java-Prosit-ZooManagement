package tn.esprit.gestionzoo.entities;

import tn.esprit.gestionzoo.exceptions.InvalidAgeException;
import tn.esprit.gestionzoo.exceptions.ZooFullException;

public class Zoo {
    private Animal[] animals;

    private String name;
    private String city;
    private int nbAnimals;


    // Instruction 25
    private Aquatic[] aquaticAnimals;

    // private final static int NB_CAGES = 25; // Instruction 14
    private final static int NB_CAGES = 3; // Instruction 33

    private final static int MAX_AQUATIC_ANIMALS = 10; // Instruction 25

    public Zoo(String name, String city) {
        this.animals = new Animal[NB_CAGES];
        this.name = name;
        this.city = city;
        this.nbAnimals = 0;

        // Instruction 25
        this.aquaticAnimals = new Aquatic[MAX_AQUATIC_ANIMALS];
    }

    // Instruction 26
    public void addAquaticAnimal(Aquatic aquatic)
    {
        for (int i = 0; i < MAX_AQUATIC_ANIMALS; i++) {
            if (aquaticAnimals[i] == null) {
                aquaticAnimals[i] = aquatic;
                nbAnimals++;
            }
        }
    }

    // Instruction 27
    public void showAquaticAnimals() {
        for (Aquatic aquatic : aquaticAnimals) {
            aquatic.swim();
        }
    }

    // Instruction 29
    public float maxPenguinSwimmingDepth() {
        float current_depth = 0.0f;
        for (Aquatic aquatic : aquaticAnimals) {
            if (aquatic instanceof Penguin) {
                Penguin p = (Penguin)aquatic;
                if (p.swimmingDepth > current_depth)
                    current_depth = p.swimmingDepth;
            }
        }
        return current_depth;
    }

    // Instruction 30
    public void displayNumberOfAquaticsByType()
    {
        int penguins = 0;
        int dolphins = 0;
        for (Aquatic aquatic : aquaticAnimals) {
            if (aquatic instanceof Penguin) {
                penguins++;
            }
            else if (aquatic instanceof Dolphin) {
                dolphins++;
            }
        }

        System.out.println("Penguins: " + penguins);
        System.out.println("Dolphins: " + dolphins);
    }

    // Instruction 18 (Getters and Setters)
    public Animal[] getAnimals() {
        return this.animals;
    }
    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        if (name == null || name.isEmpty()) {
        // OR
        // if (name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        else {
            this.name = name;
        }
    }

    public String getCity() {
        return this.city;
    }
    public void setCity(String city) {
        this.city = city;
    }

    public int getNbAnimals() {
        return this.nbAnimals;
    }
    public void setNbAnimals(int nbAnimals) {
        this.nbAnimals = nbAnimals;
    }
    // ---

    /*
    // Instruction 12
    public boolean addAnimal(Animal animal) {
        if (isZooFull()) return false; // Instruction 17

        for (int i = 0; i < NB_CAGES; i++) {
            if (animals[i] == null) {
                animals[i] = animal;
                nbAnimals++;
                return true;
            }
        }
        return false;
    } 
    */
    
    // Instruction 32
    public void addAnimal(Animal animal) throws ZooFullException, InvalidAgeException {
        
        // AMEN:
        // Check for the age first:
        if (animal.getAge() < 0) {
            // Throw the excpection if it's negative.
            throw new InvalidAgeException(animal);
        }

        // Try to add in the animal
        for (int i = 0; i < NB_CAGES; i++) {
            if (animals[i] == null) {
                animals[i] = animal;
                nbAnimals++;
                return;
            }
        }

        // AMEN:
        // If we didn't return above, that means our zoo is full.
        throw new ZooFullException();
    } 
    // ---

    // Instruction 11
    public void showAnimals() {
        for (Animal animal : animals) {
            if (animal != null) System.out.println(animal);
        }
    }
    public int searchAnimal(Animal animal) {
        for (int i = 0; i < NB_CAGES; i++) {
            if (animals[i].getName().equals(animal.getName())) {
                return i;
            }
        }
        return -1;
    }
    // ---

    // Instruction 13
    public boolean removeAnimal(Animal animal) {
        int search = searchAnimal(animal);
        if (search >= 0 && animals[search] != null) {
            animals[search] = null;
            nbAnimals--;
            return true;
        }
        return false;
    }
    // ---

    // Instruction 15
    public boolean isZooFull() {
        return nbAnimals >= NB_CAGES;
    }
    // ---

    // Instruction 16
    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.nbAnimals >= z2.nbAnimals) {
            return z1;
        }
        else {
            return z2;
        }
    }
    // ---

    public void displayZoo() {
        System.out.println(name + " " + city + " " + NB_CAGES);
    }

    @Override
    public String toString() {
        return name + " " + city + " " + NB_CAGES;
    }
}