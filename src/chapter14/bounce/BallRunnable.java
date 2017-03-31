package chapter14.bounce;

import java.awt.*;

/**
 * Created by Ganlee-QY on 2017/3/1.
 */
public class BallRunnable implements Runnable {
    private Ball ball;
    private Component component;
    public static final int STEPS = 10000;
    public static final int DELAY = 3;

    public BallRunnable(Ball ball, Component component) {
        this.ball = ball;
        this.component = component;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= STEPS; i++) {
                ball.move(component.getBounds());
                component.repaint();
                Thread.sleep(DELAY);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
