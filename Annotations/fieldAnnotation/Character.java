package Annotations.fieldAnnotation;

public class Character {

    @AutoIncrement
    private int ID;

    @Required
    private String name;

    
    private int age;

    public Character(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    @Printable
    public void display() {
        System.out.println("----------CHARACTER-------------");
        System.out.println("ID: " + this.ID);
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age + "\n");
    }
}
