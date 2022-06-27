package designpatterns.structural.decorator.icecream;

import java.util.PrimitiveIterator;

public class VanillaScoop implements IceCreamCone {
    private IceCreamCone iceCreamCone;

    public VanillaScoop(IceCreamCone iceCreamCone) {
        if (iceCreamCone == null) {
            throw new NullPointerException();
        }
        this.iceCreamCone = iceCreamCone;
    }

    @Override
    public String getConstituents() {
        return iceCreamCone.getConstituents() + " " + "Vanilla";
    }

    @Override
    public int getCost() {
        return iceCreamCone.getCost() + 15;
    }
}
