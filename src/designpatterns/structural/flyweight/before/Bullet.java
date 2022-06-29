package designpatterns.structural.flyweight.before;

public class Bullet {
    private double radius;
    private double x_coord;
    private double y_coord;
    private double z_coord;
    private double weight;
    private BulletType bulletType;
    private double speed;
    private BulletStatus bulletStatus;
    private byte[] image;
    private long userId;
    private double x_dir;
    private double y_dir;
    private double z_dir;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getX_coord() {
        return x_coord;
    }

    public void setX_coord(double x_coord) {
        this.x_coord = x_coord;
    }

    public double getY_coord() {
        return y_coord;
    }

    public void setY_coord(double y_coord) {
        this.y_coord = y_coord;
    }

    public double getZ_coord() {
        return z_coord;
    }

    public void setZ_coord(double z_coord) {
        this.z_coord = z_coord;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public BulletType getBulletType() {
        return bulletType;
    }

    public void setBulletType(BulletType bulletType) {
        this.bulletType = bulletType;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public BulletStatus getBulletStatus() {
        return bulletStatus;
    }

    public void setBulletStatus(BulletStatus bulletStatus) {
        this.bulletStatus = bulletStatus;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public double getX_dir() {
        return x_dir;
    }

    public void setX_dir(double x_dir) {
        this.x_dir = x_dir;
    }

    public double getY_dir() {
        return y_dir;
    }

    public void setY_dir(double y_dir) {
        this.y_dir = y_dir;
    }

    public double getZ_dir() {
        return z_dir;
    }

    public void setZ_dir(double z_dir) {
        this.z_dir = z_dir;
    }
}
