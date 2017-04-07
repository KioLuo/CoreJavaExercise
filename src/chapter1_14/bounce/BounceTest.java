package chapter1_14.bounce;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Ganlee-QY on 2017/2/28.
 */
public class BounceTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new BounceFrame();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }
}
