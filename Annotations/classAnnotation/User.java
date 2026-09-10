package Annotations.classAnnotation;

import Annotations.fieldAnnotation.AutoIncrement;
import Annotations.fieldAnnotation.Printable;
import Annotations.fieldAnnotation.Required;

@Entity(name = "users")
public class User {

    @AutoIncrement 
    private int ID;
    
    @Required 
    private String name;

    @Required 
    private String email;

    @MoreThan(limit = 0) 
    private int age;

    @MoreThan(limit = 0.0)
    @LessThan(limit = 4.0)
    private double rank;


    public User(String name, String email, int age, double rank) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.rank = rank;
    }

    public String getName() {
        return this.name;
    }
    public String getEmail() {
        return this.email;
    }
    public int getAge() {
        return this.age;
    }
    public double getRank() {
        return this.rank;
    }

    @Printable 
    public void displayUser() {
        System.out.println("----------USER-------------");
        System.out.println("ID: " + this.ID);
        System.out.println("Name: " + this.name);
        System.out.println("Email: " + this.email);
        System.out.println("Age: " + this.age);
        System.out.println("Rank: " + this.rank + "\n");
    }

}
