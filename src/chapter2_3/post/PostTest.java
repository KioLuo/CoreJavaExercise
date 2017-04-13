package chapter2_3.post;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Ganlee-QY on 2017/4/13.
 */
public class PostTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new PostTestFrame();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }
}
