package edu.bennington.cs;

/**
 * Created by Nidesh on 2/27/2015.
 */
public class Dog {
    public String type;
    public int age;
    public String color;

    public void printAge(){
        System.out.println("The dog is " + age + " years old.");
    }

    public void printType() {
        System.out.println("The dog is " + type + ".");
    }

    public static void encounterCat(Cat c1) {
        if (c1.type.equals("Siamese")) {
            System.out.println("*silence* (apparently the dog likes Siamese cats)");
        } else if (c1.type.equals("Persian")) {
            System.out.println("*Loud barks*");
        }

    }
}
