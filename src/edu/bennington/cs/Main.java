package edu.bennington.cs;

public class Main {

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();

        dog1.age = 5;
        dog1.color = "brown";
        dog1.type = "Labrador";

        //dog2.age = 7;
        //dog2.color = "black";
        //dog2.type = "German Shepherd";

        cat1.age = 3;
        cat1.color = "white";
        cat1.type = "Siamese";

        //cat2.age = 8;
        //.color = "gray";
        //cat2.type = "Persian";

        dog1.printAge();
        dog1.printType();
        dog1.encounterCat(cat1);

        //dog2.printAge();
        //dog2.printType();
        //dog2.encounterCat(cat2);

        cat1.printAge();
        cat1.printColor();
        cat1.encounterDog(dog1);

        //cat2.printAge();
        //cat2.printColor();
        //cat2.encounterDog(dog2);
    }
}
