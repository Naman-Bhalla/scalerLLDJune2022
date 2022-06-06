package interfaces;

public class Human extends Mammal implements Omnivore, PlantEater {

    @Override
    public void eatPlant() {
        System.out.println("Human is eating a plant");
    }
//
//    public int eatPlant() {
//        System.out.println("Human Plant Eater eatPlant");
//    }

//    @Override
    public void eatAnimal() {
        System.out.println("Human is eating an animal");
    }
}
