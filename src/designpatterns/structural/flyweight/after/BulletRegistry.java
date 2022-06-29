package designpatterns.structural.flyweight.after;

import java.util.HashMap;
import java.util.Map;

public class BulletRegistry {
    private Map<BulletType, Bullet> bullets = new HashMap<>();

    public void registerBullet(BulletType type, Bullet bullet) {
        bullets.put(type, bullet);
    }

    public Bullet getBullet(BulletType bulletType) {
        return bullets.get(bulletType);
    }
}
