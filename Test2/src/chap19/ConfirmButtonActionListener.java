package chap19;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class ConfirmButtonActionListener implements ActionListener {
	
	JTextField text;
	JLabel label;
	
	public ConfirmButtonActionListener(JTextField text, JLabel label) {
		super();
		this.text = text;
		this.label = label;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		String name = text.getText();
		label.setText(name);
	}
}
