package ru.mirea.lab8.three;

import javax.swing.*;
import java.awt.*;

public class App implements Runnable {
    private ImageIcon[] frames;
    private JLabel display;
    private int current;

    App(){
        current = 0;
        frames = new ImageIcon[] {
                new ImageIcon(getClass().getResource("/images/1.jpg")),
                new ImageIcon(getClass().getResource("/images/2.jpg")),
                new ImageIcon(getClass().getResource("/images/3.jpg")),
                new ImageIcon(getClass().getResource("/images/4.jpg"))
        };
        display = new JLabel();

        JFrame frame = new JFrame("Animation");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(2000, 2000);

        frame.setLayout(new FlowLayout());
        frame.getContentPane().add(display, BorderLayout.CENTER);
        frame.setResizable(false);
        frame.setVisible(true);
    }

    @Override
    public void run(){
        while (true) {
            display.setIcon(frames[current++]);
            if (current == frames.length) {
                current = 0;
            }

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.exit(0);
            }
        }
    }
}
