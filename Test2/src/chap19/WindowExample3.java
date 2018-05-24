package chap19;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class WindowExample3 {
	public static void main(String[] args) {
		JFrame frame = new JFrame("zoo Program");
		frame.setLocation(600, 300);
		Container contenPane = frame.getContentPane();
		GridLayout layout = new GridLayout(3, 2);
		contenPane.setLayout(layout);
		contenPane.add(new JButton("¾ó·è¸»"));
		contenPane.add(new JButton("»çÀÚ"));
		contenPane.add(new JButton("ÄÚ³¢¸®"));
		contenPane.add(new JButton("ÄÚ»Ô¼Ò"));
		contenPane.add(new JButton("Æë±Ï"));
		contenPane.add(new JButton("ÇÏÀÌ¿¡³ª"));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
}
