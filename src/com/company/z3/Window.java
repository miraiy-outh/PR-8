package com.company.z3;

import com.company.z1.Canvas;

import javax.swing.*;
import java.awt.*;
import java.util.Timer;
import java.lang.Thread;
public class Window {
    public static void main(String[] args) throws InterruptedException {
        JFrame w = new JFrame("Window");
        w.setSize(900, 700);
        w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // w.add();
        MovingCircle movingCircle = new MovingCircle();
        w.add(movingCircle);
        w.setVisible(true);
    }
}
