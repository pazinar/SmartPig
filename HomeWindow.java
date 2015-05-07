package com.smart.house.pig;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.awt.geom.GeneralPath;
import java.awt.geom.Rectangle2D;

class MyPanel extends JPanel{
	String nD,nM,nY;
	String eD,eM,eY;
	String st;
	int f;
	
	public void parampampam(int f, String nD, String nM, String nY, String eD, String eM, String eY, String st){
		this.f = f;
		this.nD = nD;
		this.nM = nM;
		this.nY = nY;
		this.eD = eD;
		this.eM = eM;
		this.eY = eY;
		this.st = st;
	}
	
}

public class HomeWindow extends JFrame {
	
	// 	Home & Graphic
	JButton 	bH,bG;
	
	//		For Home
	
	//	Home's plane
	JPanel		pH;
	JLabel		lImg;
	
	//	Data
	JLabel		te1, vl1, li1;
	JLabel		te2, vl2, li2;
	JLabel		te3, vl3, li3;
	JLabel		te4, vl4, li4;
	JLabel		te5, vl5, li5;
	JLabel		te6, vl6, li6;
	//		For Graphic
	JPanel		pG;
	
	JLabel 	k1,k2,k3,k4,k5,k6;
	
	String			st;

	
	//	Show
	
	
	
	eHandler handler = new eHandler();
	
	Color cbig;
	Color cpan;
	
	public HomeWindow(String s){
		super(s); //title
		setLayout(null); 
		
		String gwd = new String();
		String cwd = new String();
		String tad = new String();
		String wad = new String();
		String sld = new String();
		String eld = new String();
		String gazd = new String();
		
		String gwn = new String();
		String cwn = new String();
		String tan = new String();
		String wan = new String();
		String sln = new String();
		String eln = new String();
		String gazn = new String();
		
		String gwm = new String();
		String cwm = new String();
		String tam = new String();
		String wam = new String();
		String slm = new String();
		String elm = new String();
		String gazm = new String();
		
		Font big = new Font("SanSerif",Font.BOLD,20);
		Font lit = new Font("SanSerif",Font.BOLD,12);
		cbig = new Color(0,162,232);
		cpan = new Color(43,191,255);
		
		bH = new JButton("H");
		bH.setFont(big);
		bH.setBounds(0,0,50,285);
		bH.setBackground(cpan);
		bH.setBorder(BorderFactory.createEmptyBorder());
		
		bG = new JButton("G");
		bG.setFont(big);
		bG.setBounds(0,285,50,286);
		bG.setBackground(cbig);
		bG.setBorder(BorderFactory.createEmptyBorder());
		
		pH = new JPanel();
		
		
		pG = new JPanel();
		pG.setBackground(cpan);
		pG.setBounds(50, 0, 644, 571);
		pG.setLayout(null);
		pG.setVisible(false);
		
		add(bH);
		add(bG);
		add(pH);
		add(pG);
		
		pH.setBackground(new Color(255,255,255));
		pH.setBounds(50, 0, 644, 571);
		pH.setLayout(null);
		
		lImg = new JLabel("Picture");

		ImageIcon icon = new ImageIcon("PlaneHome.png");
		lImg.setIcon(icon);
		lImg.setBounds(10, 10 , 624, 551 );
		
		
		
		//	Data
		te1 = new JLabel("Temp = 21 C");
		te1.setBounds(40,10,100,50);
		te1.setFont(lit);
		vl1 = new JLabel("Vl        = 42 %");
		vl1.setBounds(40,20,100,50);
		vl1.setFont(lit);
		li1 = new JLabel("Lig      	= Включен (80%)");
		li1.setBounds(40,30,150,50);
		li1.setFont(lit);
		
		te2 = new JLabel("Temp = 22 С");
		te2.setBounds(300,10,100,50);
		te2.setFont(lit);
		vl2 = new JLabel("Vl        = 92 %");
		vl2.setBounds(300,20,100,50);
		li2 = new JLabel("Lig      = Выключен");
		li2.setBounds(300,30,150,50);

		te3 = new JLabel("Temp = 21 С");
		te3.setBounds(500,10,100,50);
		vl3 = new JLabel("Vl        = 42 %");
		vl3.setBounds(500,20,100,50);
		li3 = new JLabel("Lig      = Выключен");
		li3.setBounds(500,30,150,50);
		
		te4 = new JLabel("Temp = 21 С");
		te4.setBounds(40,480,100,50);
		vl4 = new JLabel("Vl        = 42 %");
		vl4.setBounds(40,490,100,50);
		li4 = new JLabel("Lig      = Выключен");
		li4.setBounds(40,500,150,50);

		te5 = new JLabel("Temp = 24 С");
		te5.setBounds(330,480,100,50);
		te5.setFont(lit);
		vl5 = new JLabel("Vl        = 24 %");
		vl5.setBounds(330,490,100,50);
		li5 = new JLabel("Lig      = Выключен");
		li5.setBounds(330,500,150,50);

		te6 = new JLabel("Temp = 69 С");
		te6.setBounds(500,400,100,50);
		vl6 = new JLabel("Vl        = 100 %");
		vl6.setBounds(500,490,100,50);
		li6 = new JLabel("Lig      = Включен (100%)");
		li6.setBounds(500,500,150,50);
		
		pH.add(lImg);
		
		pH.add(te1);
		pH.add(vl1);
		pH.add(li1);

		pH.add(te2);
		pH.add(vl2);
		pH.add(li2);

		pH.add(te3);
		pH.add(vl3);
		pH.add(li3);

		pH.add(te4);
		pH.add(vl4);
		pH.add(li4);
		
		pH.add(te5);
		pH.add(vl5);
		pH.add(li5);
		
		pH.add(te6);
		pH.add(vl6);
		pH.add(li6);
		
		
		bH.addActionListener(handler);
		bG.addActionListener(handler);
		
		// Graphic
		
		
		
		String test = "<html><font face='verdana' size = 4>"; 
		

		test += "<h2>За день</h2>";
		
		test += "Горячая вода : " + gwd + "<br>";
		test += "Холодная вода : " + cwd + "<br>";
		test += "Средняя температура воздуха : " + tad + "<br>";
		test += "Средняя влажность воздуха: " + wad + "<br>";
		test += "Электроэнергия : " + eld+ "<br>";
		test += "Газ : " + gazd + "<br><html>";
		
		k1 = new JLabel(test);
		k1.setBounds(50,20,500,150);
		k1.setFont(new Font("SanSerif",Font.BOLD,12));
		pG.add(k1);
		
		test = "<html><font face='verdana' size = 4>"; 
		

		test += "<h2>За неделю</h2>";
		
		test += "Горячая вода : " + gwn + "<br>";
		test += "Холодная вода : " + cwn + "<br>";
		test += "Средняя температура воздуха : " + tan + "<br>";
		test += "Средняя влажность воздуха: " + wan + "<br>";
		test += "Электроэнергия : " + eln+ "<br>";
		test += "Газ : " + gazn + "<br><html>";
		
		k1 = new JLabel(test);
		k1.setBounds(50,200,500,150);
		k1.setFont(new Font("SanSerif",Font.BOLD,12));
		pG.add(k1);
		
		test = "<html><font face='verdana' size = 4>"; 
		

		test += "<h2>За месяц</h2>";
		
		test += "Горячая вода : " + gwm + "<br>";
		test += "Холодная вода : " + cwm + "<br>";
		test += "Средняя температура воздуха : " + tam + "<br>";
		test += "Средняя влажность воздуха: " + wam + "<br>";
		test += "Электроэнергия : " + elm+ "<br>";
		test += "Газ : " + gazm + "<br><html>";
		
		k1 = new JLabel(test);
		k1.setBounds(50,375,500,150);
		k1.setFont(new Font("SanSerif",Font.BOLD,12));
		pG.add(k1);
		
		
	
		//k1.addActionListener(handler);
		
		/*bNed = new JButton("Неделя");
		bNed.setBounds(238,25,178,50);
		bNed.setFont(new Font("SanSerif",Font.BOLD,22));
		pG.add(bNed);
		bNed.addActionListener(handler);
		
		bMon = new JButton("Месяц");
		bMon.setBounds(426,25,178,50);
		bMon.setFont(new Font("SanSerif",Font.BOLD,22));
		pG.add(bMon);
		bMon.addActionListener(handler);	*/	
		
		
		
	}
	
	public class eHandler implements ActionListener{
		int f = 0; // Temp
		// call
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==bG){
				pH.setVisible(false);
				pG.setVisible(true);
				bG.setBackground(cpan);
				bH.setBackground(cbig);
				
			}
			if(e.getSource()==bH){
				pG.setVisible(false);
				pH.setVisible(true);
				bH.setBackground(cpan);
				bG.setBackground(cbig);
				
			}
	
			
		}
	}
}
