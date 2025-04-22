package tn.esprit.gestionzoo.main;
import tn.esprit.gestionzoo.entities.*;
import tn.esprit.gestionzoo.enums.Food;
import tn.esprit.gestionzoo.exceptions.InvalidAgeException;
import tn.esprit.gestionzoo.exceptions.ZooFullException;

public class ZooManagement
{
    public static void main(String[] args)
    {
        // Instruction 38
        Penguin penguin = new Penguin("Spheniscidae ", "Penguin", -1, false, "cold ocean?", 20);
        penguin.eatMeat(Food.MEAT);

        Terrestrial elephant = new Terrestrial("Elephantidae", "Elephant", 5, true, 4);
        elephant.eatMeat(Food.MEAT);
        elephant.eatPlant(Food.PLANT);
        elephant.eatPlantAndMeat(Food.BOTH);

        /*
        Zoo myZoo = new Zoo("My Zoo", "Somewhere");

        // Instruction 33
        // Instruction 34 (Now, we gotta handle the InvalidAgeExcepction because the addAnimal functions `throws` it)
        try {
            Animal lion = new Animal("Felidae", "Lion", 3, true);
            myZoo.addAnimal(lion);
            System.out.println("Number of animals: " + myZoo.getNbAnimals());
            
            Dolphin dolphin = new Dolphin("Delphinidae", "Dolphin", 1, true, "ocean?", 10);
            myZoo.addAnimal(dolphin);
            System.out.println("Number of animals: " + myZoo.getNbAnimals());
            
            // Instruction 34, pass in a negative age:
            Penguin penguin = new Penguin("Spheniscidae ", "Penguin", -1, false, "cold ocean?", 20);
            myZoo.addAnimal(penguin);
            System.out.println("Number of animals: " + myZoo.getNbAnimals());
            
            // Commented this to test out the InvalidAgeException
            // Terrestrial elephant = new Terrestrial("Elephantidae", "Elephant", 5, true, 4);
            // myZoo.addAnimal(elephant);
            // System.out.println("Number of animals: " + myZoo.getNbAnimals());

        } catch (ZooFullException e) {
            System.out.println(e.getMessage());
        }
        catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
        */


        /*
        // Instruction 21
        Terrestrial lion = new Terrestrial("Felidae", "Lion", 3, true, 4);
        Dolphin dolphin = new Dolphin("Delphinidae", "Dolphin", 1, true, "ocean?", 10);
        Penguin penguin = new Penguin("Spheniscidae ", "Penguin", 1, false, "cold ocean?", 20);

        /*
        // Instruction 23
        System.out.println(lion);
        System.out.println(dolphin);
        System.out.println(penguin);

        // Instruction 24
        dolphin.swim();
        penguin.swim();
        // Que remarquez-vous ?
        // La classe Dolphin redéfinit la méthode swim() et affiche son propre message,
        // tandis que la classe Penguin ne la redéfinit pas et utilise donc la version héritée de Aquatic.

        // Instruction 25
        myZoo.addAquaticAnimal(penguin);
        myZoo.addAquaticAnimal(dolphin);
        // Instruction 28
        myZoo.showAquaticAnimals();
        */
    }
}