package com.company.z1;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Canvas extends JComponent {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D)g;
        Random rand = new Random();
        Color color[] = {Color.RED, Color.BLUE, Color.YELLOW, Color.GREEN, Color.PINK, Color.MAGENTA,
                Color.ORANGE, Color.BLACK, Color.WHITE, Color.CYAN};
        String colour[] = {"red", "blue", "yellow", "green", "pink", "magenta", "orange", "black", "white", "cyan"};
        String shape[] = {"rectangle", "circle"};
        int r1;
        int r2;
        for (int i = 0; i < 20; i++) {
            r1 = rand.nextInt(2);
            r2 = rand.nextInt(9);
            switch(shape[r1]) {
                case "rectangle":
                    g2d.setColor(color[r2]);
                    Rectangle rec1 = new Rectangle(colour[r2],rand.nextInt(200), rand.nextInt(200), rand.nextInt(900), rand.nextInt(700));
                    g2d.fillRect(rec1.getX(), rec1.getY(), rec1.getWidth(), rec1.getLength());
                case "circle":
                    g2d.setColor(color[r2]);
                    Circle circle1 = new Circle(colour[r2],rand.nextInt(200), rand.nextInt(200), rand.nextInt(900), rand.nextInt(700));
                    g2d.fillOval(circle1.getX(), circle1.getY(), circle1.getWidth(), circle1.getLength());
            }
        }
    }
}
