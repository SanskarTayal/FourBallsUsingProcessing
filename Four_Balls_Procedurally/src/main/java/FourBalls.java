import processing.core.PApplet;

public class FourBalls extends PApplet {

    private static final int WIDTH = 1280, HEIGHT = 720, BALL_DIAMETER = 20, COUNT_OF_BALLS = 4;
    private static final int[] heightForBalls = {(HEIGHT * 1) / 5, (HEIGHT * 2) / 5, (HEIGHT * 3) / 5, (HEIGHT * 4) / 5};
    private static float[] X_ForBalls = {1, 1, 1, 1};

    public static void main(String[] args) {
        PApplet.main("FourBalls", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
        for (int i = 0; i < COUNT_OF_BALLS; i++) {
            ellipse(X_ForBalls[i], heightForBalls[i], BALL_DIAMETER, BALL_DIAMETER);
            int speedOfBall = i + 1;
            float newPositionOfX = X_ForBalls[i] + speedOfBall;
            X_ForBalls[i] = newPositionOfX;

        }


    }

}
