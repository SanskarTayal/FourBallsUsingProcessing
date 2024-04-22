public class Ball{
    private int diameter, speed, x_Position=1;
    private float height;

    public Ball(int diaOfBalls, int speed, float height) {
        this.diameter=diaOfBalls;
        this.speed=speed;
        this.height=height;
    }
    public void updatePosition()
    {
        x_Position+=speed;
    }
    public int getDiameter() {
        return diameter;
    }

    public int getSpeed() {
        return speed;
    }

    public int getX_Position() {
        return x_Position;
    }

    public float getHeight() {
        return height;
    }
}

