import processing.core.PApplet;

public class FourBalls extends PApplet {
    private static final int FRAME_WIDTH = 1280, FRAME_HEIGHT = 720, numOfBalls = 4, diaOfBalls = 15;
    private static Ball[] ball = new Ball[numOfBalls];

    public static void main(String[] args) {
        PApplet.main("FourBalls", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(FRAME_WIDTH, FRAME_HEIGHT);
    }

    @Override
    public void setup() {
        super.setup();
        for (int ballNo = 1; ballNo <= numOfBalls; ballNo++) {
            int speed = ballNo;
            float height = (ballNo) * (FRAME_HEIGHT / 5);
            ball[ballNo - 1] = new Ball(diaOfBalls, speed, height);
        }
    }

    @Override
    public void draw() {
        for (Ball b : ball) {
            ellipse(b.getX_Position(), b.getHeight(), b.getDiameter(), b.getDiameter());
            b.updatePosition();
        }
    }


}
