package designpatterns.prototype;

public class Crow extends Bird {
    private String sound = "Kaw";

    public void setSound(String sound) {
        this.sound = sound;
    }

    public Crow() {}

    public Crow(Crow old) {
        super(old);
        this.sound = old.sound;
    }

    @Override
    public Crow clone() {
//        Parent attributes aren't copied
//        Crow copy = new Crow();
//        copy.sound = this.sound;

//        Bird cloneParent = super.clone();

        return new Crow(this);
    }
}
