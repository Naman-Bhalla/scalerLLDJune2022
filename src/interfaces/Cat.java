package interfaces;

public class Cat extends Mammal implements Carnivore {
    Cat() {
    }

    @Override
    public void eatAnimal() {
        System.out.println("Cat is eating animal");
    }
}
