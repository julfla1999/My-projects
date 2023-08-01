package interfaces;

public class Opel implements Car {
    private int speed;

    public Opel(int speed) {
        this.speed = speed;
    }
    @Override
    public int getSpeed() {
        return this.speed;
    }

    @Override
    public void increaseSpeed() {
        this.speed += 50;
    }

    @Override
    public void decreaseSpeed() {
        this.speed -= 30;
    }
}
