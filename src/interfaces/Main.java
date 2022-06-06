package interfaces;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Herbivore> herbivores = List.of(
                new Human(),
                new Dog()
        );

        for (Herbivore herbivore: herbivores) {
            herbivore.eatPlant();
        }

        Herbivore herbivore = new Human();
        PlantEater plantEater = new Human();
    }
}
