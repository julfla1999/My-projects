package interfaces;

public class Audi implements Car {
    private int speed;

    public Audi(int speed) {
        this.speed = speed;
    }
    @Override
    public int getSpeed() {
        return this.speed;
    }

    @Override
    public void increaseSpeed() {
        this.speed += 120;
    }

    @Override
    public void decreaseSpeed() {
        this.speed -= 60;
    }
}
