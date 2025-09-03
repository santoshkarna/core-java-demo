package day12.oops;

public class Tiger extends Demo implements Animal, WildAnimal{

    @Override
    public void makeSound() {
        System.out.println("Tiger roars!!!");
    }

    @Override
    public void roam() {
        System.out.println("tiger roams in jungle");
    }
}
