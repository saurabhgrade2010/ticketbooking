/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bussystem.gui;

/**
 *
 * @author love
 */
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.awt.Container.*;
import java.awt.Component.*;
import javax.swing.JFrame;

@SuppressWarnings("unchecked")
public class Myframe1 extends JFrame implements ActionListener {

	public Myframe1() {
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		getContentPane().setLayout(new FlowLayout());
		setMinimumSize(new Dimension(500, 500));
		JButton HitMe = new JButton("Hit Me!");
                for(int i=0;i<5;++i){
		HitMe.addActionListener(new aListener());
		getContentPane().add(HitMe);}

		pack();
	}

	public void actionPerformed(ActionEvent e) {
	}

	class aListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {

			System.out.println(e);
			int panelWidth = 100;
			int panelHeight = 100;
			Dimension panelSize = new Dimension(panelWidth, panelHeight);
			JPanel100 myPanel = new JPanel100("Green Panel", panelSize, 204, 255, 204);
                        getContentPane().add(myPanel);
			myPanel.setSize(100, 100);
			myPanel.add(new JLabel("Cluster A"));
			myPanel.setLayout(new FlowLayout());
			myPanel.add(new JButton("A"));
			
                        add(myPanel);
			setVisible(true);
			myPanel.validate();

		}
	}

	public class JPanel100 extends JPanel {

		public JPanel100(String panelName, Dimension panelSize, int colourR, int colourG, int colourB) {

			setBackground(new Color(colourR, colourG, colourB));
			setMinimumSize(panelSize);
			setMaximumSize(panelSize);
			setSize(panelSize);
			setPreferredSize(panelSize);
			setName(panelName);
		}
	}

	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {

			public void run() {
				new Myframe1().setVisible(true);
			}
		});
	}
}
