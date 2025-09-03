package day13.oops;

import java.util.Scanner;


//runtime polymorphism(dynamic binding)
//which can be achieved by overriding of methods
public class AnimalTest {
    public static void main(String[] args) {
        Animal animal = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the animal: ");
        String choice = sc.next();

        switch (choice) {
            case "dog":
                animal = new Dog();
                break;
            case "tiger":
                animal = new Tiger();
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }

        if (animal != null) {
            getAnimalSound(animal);
        }

    }

    public static void getAnimalSound(Animal animal) {
        animal.makeSound();
    }
}
