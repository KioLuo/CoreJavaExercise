package chapter14.bounce;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ganlee-QY on 2017/3/1.
 */
public class BallComponent extends JPanel{
    private static final int DEFAULT_WIDTH = 450;
    private static final int DEFAULT_HEIGHT = 350;
    private List<Ball> balls = new ArrayList<>();

    public void add(Ball ball) {
        balls.add(ball);
    }

    public void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        Graphics2D g2 = (Graphics2D) graphics;
        for (Ball b : balls) {
            g2.fill(b.getShape());
        }

    }

    public Dimension getPreferredSize() {
        return new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT);
    }
}
