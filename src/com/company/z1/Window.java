package com.company.z1;
import javax.swing.*;
public class Window {

    public static void main(String[] args) {
	    JFrame w = new JFrame("Window");
	    w.setSize(900, 700);
	    w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    Canvas c = new Canvas();
	    w.add(c);
	    w.setVisible(true);
    }
}
