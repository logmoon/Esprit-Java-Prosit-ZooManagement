
public class Zoo {
    Animal[] animals;
    String name;
    String city;
    int nbCages;

    public Zoo(String name, String city, int nbCages) {
        animals = new Animal[nbCages];
        this.name = name;
        this.city = city;
        this.nbCages = nbCages;
    }

    public void displayZoo() {
        System.out.println(name + " " + city + " " + nbCages);
    }

    @Override
    public String toString() {
        return name + " " + city + " " + nbCages;
    }
}
