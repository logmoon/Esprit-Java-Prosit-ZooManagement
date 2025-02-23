package tn.esprit.gestionzoo.main;
import tn.esprit.gestionzoo.entities.*;

public class ZooManagement
{
    public static void main(String[] args)
    {
        // Instruction 21
        Aquatic fish = new Aquatic("Osteichthyes", "Fish", 1, false, "Salt Water");
        Terrestrial lion = new Terrestrial("Felidae", "Lion", 3, true, 4);
        Dolphin dolphin = new Dolphin("Delphinidae", "Dolphin", 1, true, "ocean?", 10);
        Penguin penguin = new Penguin("Spheniscidae ", "Penguin", 1, false, "cold ocean?", 20);

        // Instruction 23
        System.out.println(fish);
        System.out.println(lion);
        System.out.println(dolphin);
        System.out.println(penguin);

        // Instruction 24
        fish.swim();
        dolphin.swim();
        penguin.swim();
        /*
         * Que remarquez-vous ?
         * La classe Dolphin redéfinit la méthode swim() et affiche son propre message,
         * tandis que la classe Penguin ne la redéfinit pas et utilise donc la version héritée de Aquatic.
        */
    }
}