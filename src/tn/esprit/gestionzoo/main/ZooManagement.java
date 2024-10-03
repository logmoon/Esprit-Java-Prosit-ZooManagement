package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;

public class ZooManagement
{
    public static void main(String[] args)
    {
        // Instruction 10
        Animal lion = new Animal("Felidae", "Lion", 3, true);
        Animal giraffe = new Animal("Giraffids", "Giraffe", 1, true);
        Animal giraffe1 = new Animal("Giraffids", "Giraffe", 1, true);
        Animal giraffe2 = new Animal("Giraffids", "Giraffe", 1, true);
        Animal giraffe3 = new Animal("Giraffids", "Giraffe", 1, true);
        Animal giraffe4 = new Animal("Giraffids", "Giraffe", 1, true);

        Zoo myZoo = new Zoo("MyZoo", "Tunis");

        if (myZoo.addAnimal(lion)) {
            System.out.println("tn.esprit.gestionzoo.entities.Animal added");
        }
        else {
            System.out.println("tn.esprit.gestionzoo.entities.Animal wasn't added");
        }

        if (myZoo.addAnimal(giraffe)) {
            System.out.println("tn.esprit.gestionzoo.entities.Animal added");
        }
        else {
            System.out.println("tn.esprit.gestionzoo.entities.Animal wasn't added");
        }

        if (myZoo.addAnimal(giraffe1)) {
            System.out.println("tn.esprit.gestionzoo.entities.Animal added");
        }
        else {
            System.out.println("tn.esprit.gestionzoo.entities.Animal wasn't added");
        }

        if (myZoo.addAnimal(giraffe2)) {
            System.out.println("tn.esprit.gestionzoo.entities.Animal added");
        }
        else {
            System.out.println("tn.esprit.gestionzoo.entities.Animal wasn't added");
        }

        if (myZoo.addAnimal(giraffe3)) {
            System.out.println("tn.esprit.gestionzoo.entities.Animal added");
        }
        else {
            System.out.println("tn.esprit.gestionzoo.entities.Animal wasn't added");
        }

        // Avec un nb de cages = 5. giraffe4 ne s'ajoute pas au liste des animals, la methode addAnimal retourne false.
        if (myZoo.addAnimal(giraffe4)) {
            System.out.println("tn.esprit.gestionzoo.entities.Animal added");
        }
        else {
            System.out.println("tn.esprit.gestionzoo.entities.Animal wasn't added");
        }

        // Instruction 11
        // Initializer myZoo une autre fois pour tester les autres methodes
        myZoo = new Zoo("MyZoo", "Tunis");
        myZoo.addAnimal(lion);
        Animal lion2 = new Animal("Felidae", "Lion", 3, true);
        myZoo.addAnimal(lion2);

        myZoo.showAnimals();

        System.out.println(myZoo.searchAnimal(lion)); // Cela retourne 0 qui est bien l'indice de l'animal lion
        System.out.println(myZoo.searchAnimal(lion2)); // Cela retourne 0 aussi, mais lion2 a l'index 1 dans la tableau animals


        // Tester les autres methodes
        // Remove animal
        if (myZoo.removeAnimal(lion2)) {
            System.out.println("tn.esprit.gestionzoo.entities.Animal removed");
        }
        myZoo.showAnimals();
        // Is tn.esprit.gestionzoo.entities.Zoo Full
        System.out.println(myZoo.isZooFull());
        // Comparer
        Zoo mySecondZoo = new Zoo("MySecondZoo", "Nabeul");
        Zoo z = Zoo.comparerZoo(myZoo, mySecondZoo);
        System.out.println(z);
    }
}