import java.util.Scanner;

public class ZooManagement
{
    public static void main(String[] args)
    {
        /*
        // Instruction 1

        String zooName = "Zoo";
        int nbCages = 20;
        System.out.println("My Zoo: " + zooName + ". Comporte: " + nbCages);
        */

        // Instruction 2
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the zoo's name:");
        String zooName = scanner.nextLine();

        System.out.println("Enter the number of cages");
        int nbCages = scanner.nextInt();

        System.out.println("My Zoo: " + zooName + ". Comporte: " + nbCages);
    }
}