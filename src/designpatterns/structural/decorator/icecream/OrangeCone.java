package designpatterns.structural.decorator.icecream;

public class OrangeCone implements IceCreamCone {

    @Override
    public int getCost() {
        return 10;
    }


    @Override
    public String getConstituents() {
        return "Orange Cone";
    }
}
