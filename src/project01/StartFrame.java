package project01;

import java.awt.Color;

import javax.swing.JFrame;

public class StartFrame {
	
	public StartFrame() {
		
		
		JFrame f = new JFrame("Welcome!");

		f.setSize(900,1000); // frame size
		f.setLocationRelativeTo(null); // center frame
		f.setResizable(false); // Unable to change frame size
		f.getContentPane().setLayout(null); // absolute layout
		MainPage m = new MainPage();
		f.add(m);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		f.setVisible(true);
		
	}

}
