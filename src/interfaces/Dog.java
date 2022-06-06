package interfaces;

public class Dog extends Mammal implements Herbivore {

    @Override
    public void eatPlant() {
        System.out.println("Dog is eating a plant");
    }
}
