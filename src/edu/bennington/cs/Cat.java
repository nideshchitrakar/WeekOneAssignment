package edu.bennington.cs;

/**
 * Created by Nidesh on 2/27/2015.
 */
public class Cat {
    public String type;
    public int age;
    public String color;

    public void printAge(){
        System.out.println("The cat is " + age + " years old.");
    }

    public void printColor() {
        System.out.println("The cat is " + color + ".");
    }

    public static void encounterDog(Dog d1) {
        if (d1.color.equals("brown")) {
            System.out.println("Hisssssss *loud meows*");
        } else if (d1.type.equals("German Shepherd")) {
            System.out.println("*the cat fled*");
        }
    }
}
