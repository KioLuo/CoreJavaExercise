package chapter1_14.swing;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Ganlee-QY on 2017/3/10.
 */
public class SwingThreadTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new SwingThreadFrame();
                frame.setTitle("SwingThreadTest");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });

    }
}
