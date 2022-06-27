package designpatterns.structural.decorator.icecream;

import java.security.InvalidParameterException;

public class BlueCone implements IceCreamCone{

    public BlueCone(IceCreamCone iceCreamCone) {
        if (iceCreamCone.getConstituents().contains("scoop")) {
            throw new InvalidParameterException();
        }
    }

    public BlueCone() {

    }

    @Override
    public int getCost() {
        return 5;
    }


    @Override
    public String getConstituents() {
        return "Blue Cone";
    }
}

// Implement Pizza Creation System
// ThinCrust
// Normal
// Pan
// 5 toppings
// you can have more than 1 base but can't sandwich
// implement a file encrypter
// TextPrinter {
//   printText()
// }
// add followiong decorations:
// - encrypt printedText
// - encode printed Text
