package interfaces;

public class Skoda implements Car {
    private int speed;

    public Skoda(int speed) {
        this.speed = speed;
    }
    @Override
    public int getSpeed() {
        return this.speed;
    }

    @Override
    public void increaseSpeed() {
        this.speed += 90;
    }

    @Override
    public void decreaseSpeed() {
        this.speed -= 20;
    }
}
