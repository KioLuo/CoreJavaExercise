package chapter15.zip;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Ganlee-QY on 2017/3/16.
 */
public class ZipTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                ZipTestFrame frame = new ZipTestFrame();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }
}
