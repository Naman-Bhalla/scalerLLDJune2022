package designpatterns.structural.decorator.icecream;

public class Customer {

    public static void main(String[] args) {
        // Chocobar: Blue Cone + 2 Choco Scoop
        // KesarPista: Blue Cone + 1 Vanilla

        IceCreamCone chocobar = new ChocolateScoop(new ChocolateScoop(new BlueCone()));
        IceCreamCone kesarPista = new VanillaScoop(new BlueCone());

        IceCreamCone iceCreamCone =
                new VanillaScoop(
                    new ChocolateScoop(
                        new VanillaScoop(
                                new OrangeCone()
                        )
                    )
                );

        new VanillaScoop(null);

        IceCreamCone chocoWithOneVanilla = new VanillaScoop(chocobar);
        System.out.println(chocoWithOneVanilla.getCost());
        // Pizza
        // Coffe Machine

        System.out.println(iceCreamCone.getCost());
        System.out.println(iceCreamCone.getConstituents());
    }
}
