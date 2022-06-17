package designpatterns.prototype;

public class Sparrow extends Bird {
    private String legsSize;

    public void setLegsSize(String legsSize) {
        this.legsSize = legsSize;
    }

    public Sparrow() {}

    public Sparrow(Sparrow oldObject) {
        super(oldObject);
        this.legsSize = oldObject.legsSize;
    }

    @Override
    public Sparrow clone() {
        return new Sparrow(this);
    }
}
