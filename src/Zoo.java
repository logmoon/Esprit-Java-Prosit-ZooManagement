import java.util.Objects;

public class Zoo {
    Animal[] animals;
    String name;
    String city;
    int nbAnimals;

    final int NB_CAGES = 25; // Instruction 14

    public Zoo(String name, String city) {
        animals = new Animal[NB_CAGES];
        this.name = name;
        this.city = city;
        this.nbAnimals = 0;
    }

    /*
    // Instruction 10
    public boolean addAnimal(Animal animal) {
        if (nbAnimals < nbCages) {
            animals[nbAnimals++] = animal;
            return true;
        }
        return false;
    }
    */
    // Instruction 12
    public boolean addAnimal(Animal animal) {
        if (nbAnimals >= NB_CAGES) return false;

        for (int i = 0; i < NB_CAGES; i++) {
            if (animals[i] == null) {
                animals[i] = animal;
                nbAnimals++;
                return true;
            }
        }
        return false;
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
            if (animals[i].name.equals(animal.name)) {
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