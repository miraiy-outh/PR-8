package com.company.z2;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Window extends JFrame {
    public static void main(String[] args) throws IOException {
        JFrame w = new JFrame("Window");
        w.setSize(1000, 900);
        BufferedImage image = ImageIO.read(new File(args[0]));
        JLabel label = new JLabel(new ImageIcon(image));
        w.add(label);
        w.setVisible(true);
    }

}