package chap19;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class WindowExample4 {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Fruit Basket Program");
		frame.setLocation(600, 300);
		Container contenPane = frame.getContentPane();
		FlowLayout layout = new FlowLayout();
		contenPane.setLayout(layout);
		contenPane.add(new JButton("사과"));
		contenPane.add(new JButton("파인애플"));
		contenPane.add(new JButton("오렌지"));
		contenPane.add(new JButton("포도"));
		contenPane.add(new JButton("레몬"));
		contenPane.add(new JButton("복숭아"));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
}