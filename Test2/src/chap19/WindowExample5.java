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
		
		//����
		Color color = new Color(205, 250, 100);
		frame.getContentPane().setBackground( color );
		
		Container contenPane = frame.getContentPane();
		BoxLayout layout = new BoxLayout(contenPane,BoxLayout.Y_AXIS);
		contenPane.setLayout(layout);
		contenPane.add(new JButton("�ڹ�"));
		contenPane.add(new JButton("����������"));
		contenPane.add(new JButton("īǪġ��"));
		contenPane.add(new JButton("��縶��ƾ"));
		contenPane.add(new JButton("�ݷ����"));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
}