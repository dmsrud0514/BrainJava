package chap19;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class WindowExample5 {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Cafe Program");
		frame.setLocation(600, 300);
		
		//색상
		Color color = new Color(205, 250, 100);
		frame.getContentPane().setBackground( color );
		
		Container contenPane = frame.getContentPane();
		BoxLayout layout = new BoxLayout(contenPane,BoxLayout.Y_AXIS);
		contenPane.setLayout(layout);
		contenPane.add(new JButton("자바"));
		contenPane.add(new JButton("에스프레소"));
		contenPane.add(new JButton("카푸치노"));
		contenPane.add(new JButton("블루마운틴"));
		contenPane.add(new JButton("콜럼비아"));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
}