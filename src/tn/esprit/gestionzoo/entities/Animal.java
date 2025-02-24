package tn.esprit.gestionzoo.entities;

public class Animal {
    private String family;
    protected String name;
    protected int age;
    private boolean isMammal;

    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }

    // Instruction 18 (Getters and Setters)
    public String getFamily() {
        return family;
    }
    public void setFamily(String family) {
        this.family = family;
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }
    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Invalid Age");
        }
        else {
            this.age = age;
        }
    }

    public boolean isMammal() {
        return this.isMammal;
    }
    public void setIsMammal(boolean isMammal) {
        this.isMammal = isMammal;
    }
    // ---

    @Override
    public String toString() {
        return "Animal Name: " + name + ".\nFamily: " + family + ".\nAge: " + age + ".\nIs Mammal?: " + isMammal;
    }
}