package designpatterns.structural.flyweight.before;

import java.util.ArrayList;
import java.util.List;

public class Client {


    public static void main(String[] args) {
        List<Bullet> bullets = new ArrayList<>();

        for (int i = 0; i < 200000; ++i) {
            Bullet bullet = new Bullet();
            bullet.setImage(new byte[1000]);
            bullets.add(bullet);

        }
    }
}
