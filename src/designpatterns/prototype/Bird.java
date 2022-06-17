package designpatterns.prototype;

import overriding.B;

public class Bird implements Cloneable<Bird> {
    private String name;
    private String color;
    private int weight;

    public Bird() {}

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Bird(Bird old) {
        this.name = old.name;
        this.weight = old.weight;
        this.color = old.color;
    }
    @Override
    public Bird clone() {
//        This solution only works when the class
//        that I am cloning is the parent class
//        Bird copy = new Bird();
//        copy.color = this.color;
//        copy.name = this.name;
//        copy.weight = this.weight;
//        return copy;

        return new Bird(this);
    }
}
