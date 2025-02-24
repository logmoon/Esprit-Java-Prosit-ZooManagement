package tn.esprit.gestionzoo.main;
import tn.esprit.gestionzoo.entities.*;

public class ZooManagement
{
    public static void main(String[] args)
    {
        Zoo myZoo = new Zoo("My Zoo", "Somewhere");

        // Instruction 21
        Terrestrial lion = new Terrestrial("Felidae", "Lion", 3, true, 4);
        Dolphin dolphin = new Dolphin("Delphinidae", "Dolphin", 1, true, "ocean?", 10);
        Penguin penguin = new Penguin("Spheniscidae ", "Penguin", 1, false, "cold ocean?", 20);

        /*
        // Instruction 23
        System.out.println(lion);
        System.out.println(dolphin);
        System.out.println(penguin);
        */

        // Instruction 24
        dolphin.swim();
        penguin.swim();
        /*
         * Que remarquez-vous ?
         * La classe Dolphin redéfinit la méthode swim() et affiche son propre message,
         * tandis que la classe Penguin ne la redéfinit pas et utilise donc la version héritée de Aquatic.
        */

        // Instruction 25
        myZoo.addAquaticAnimal(penguin);
        myZoo.addAquaticAnimal(dolphin);
        // Instruction 28
        myZoo.showAquaticAnimals();
    }
}