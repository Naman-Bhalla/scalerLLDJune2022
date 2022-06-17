package designpatterns.prototype;

import overriding.B;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        Bird bird1 = new Bird();
        bird1.setName("Nmana");
        bird1.setColor("White");
        bird1.setWeight(12);

        Sparrow sparrow1 = new Sparrow();
        sparrow1.setColor("Blue");
        sparrow1.setLegsSize("hey");

        Crow crow1 = new Crow();
        crow1.setSound("Kooooooo");
        crow1.setWeight(34);

        List<Bird> birds = List.of(
                sparrow1,
                crow1,
                bird1
        );

        List<Bird> children = new ArrayList<>();

        for (Bird parent: birds) {
//            if (parent instanceof Bird) {
//                children.add(new Bird(parent));
//            }

            children.add(parent.clone());
        }

        for (Bird child: children) {
            child.setName("IT IS A COPY");
        }

        System.out.println("Done");

        Sparrow longLeggedSparrow = new Sparrow();
        longLeggedSparrow.setLegsSize("hundred");

        Crow sweetSoundCrow = new Crow();
        sweetSoundCrow.setSound("kookoo");

        BirdRegistry birdRegistry = new BirdRegistry();
        birdRegistry.registerBird("sweetSoundCrow", sweetSoundCrow);
        birdRegistry.registerBird("longLeggedSparrow", longLeggedSparrow);

        List<String> getBirdOfTypes = List.of(
                "sweetSoundCrow",
                "longLeggedSparrow",
                "sweetSoundCrow"
        );

        List<Bird> requestedBirds = new ArrayList<>();

        for (String type: getBirdOfTypes) {
            requestedBirds.add(birdRegistry.getBird(type));
        }

        System.out.println("Done");
    }
}
