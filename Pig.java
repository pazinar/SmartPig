package com.smart.house.pig;

import javax.*;
import javax.swing.JFrame;

public class Pig {

	public static void main(String[] args) {
		HomeWindow r = new HomeWindow("G-гурда");
		r.setVisible(true);
		r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		r.setSize(700,600);
		r.setResizable(false);
		r.setLocationRelativeTo(null);
		//int i=JFrame.EXIT_ON_CLOSE;
	}

}
