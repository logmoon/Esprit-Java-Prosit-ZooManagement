import java.util.Scanner;

public class ZooManagement
{
    public static void main(String[] args)
    {
        /*
        Instruction 5:
        Animal lion = new Animal();
        Zoo myZoo = new Zoo();
        Instruction 6:
        Apres avoir ajouté les constructeurs parametré aux classes Animal et Zoo, on voit deux erreurs
        au niveau de l'instanciation des deux instance lion de Animal et myZoo de Zoo, leurs constructeurs
        demande les parametres qu'on a demandé au niveau du constructeur dans Animal et Zoo.
        */

        Animal lion = new Animal("Felidae", "Lion", 3, true);
        Animal giraffe = new Animal("Giraffids", "Giraffe", 1, true);
        Zoo myZoo = new Zoo("MyZoo", "Tunis", 20);

        myZoo.displayZoo();
        System.out.println(myZoo);
        System.out.println(myZoo.toString());
    }
}