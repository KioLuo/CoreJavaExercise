package chapter14.swing;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

/**
 * Created by Ganlee-QY on 2017/3/10.
 */
public class GoodWorkerRunnable implements Runnable {
    private JComboBox<Integer> combo;
    private Random generator;
    public GoodWorkerRunnable(JComboBox<Integer> combo) {
        this.combo = combo;
        generator = new Random();
    }

    @Override
    public void run() {
        try {
            while (true) {
                EventQueue.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        int i = Math.abs(generator.nextInt());
                        if (i % 2 == 0) {
                            combo.insertItemAt(i, 0);
                        } else if (combo.getItemCount() > 0) {
                            combo.removeItemAt(i % combo.getItemCount());
                        }
                    }
                });
                Thread.sleep(1);
            }
        } catch (InterruptedException e) {
        }
    }
}
