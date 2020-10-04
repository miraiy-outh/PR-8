package com.company.z3;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.*;
public class MovingCircle  extends JComponent {
    private Timer timer;
    static public int x = 10;
    static public int y = 100;
    static public int stateX = 0;
    static public int stateY = 0;
    public MovingCircle() {
        Timer timer = new Timer(50,new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                repaint();
            }
        });
        timer.start();
    }
    public void paintComponent(Graphics g) {
        Random rand = new Random();
        Graphics2D g2d = (Graphics2D)g;
        Color color[] = {Color.RED, Color.BLUE, Color.YELLOW, Color.GREEN, Color.PINK, Color.MAGENTA,
                Color.ORANGE, Color.BLACK, Color.WHITE, Color.CYAN};
        int r2 = rand.nextInt(9);
        g2d.setColor(color[r2]);
        g.fillOval(x, y, 50, 50);
        if (x <= 0 || x >= 840) {
            if (stateX == 0) {
                stateX = 1;
                x -= 10;
            }
            else {
                stateX = 0;
                x += 10;
            }
        }
        else {
            if (stateX == 0) {
                x += 10;
            }
            else {
                x -= 10;
            }
        }
        if (y <= 0 || y >= 620) {
            if (stateY == 0) {
                stateY = 1;
                y -= 10;
            }
            else {
                stateY = 0;
                y += 10;
            }
        }
        else {
            if (stateY == 0) {
                y += 10;
            }
            else {
                y -= 10;
            }
        }
    }
}
