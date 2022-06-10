package gui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import event.ButtonAddListener;
import event.ButtonDeleteListener;
import event.ButtonEditListener;
import event.ButtonExitListener;
import event.ButtonViewListener;

//Program의 기본 Menu를 보여주고 할 작업을 선택받는 GUI.
public class MenuSelection extends JPanel {
		WindowFrame frame;
		
	public MenuSelection(WindowFrame frame) {
		this.frame = frame;
		
		this.setLayout(new BorderLayout());
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JLabel label = new JLabel("Menu Selection");
		
		JButton button1 = new JButton("Add Schedule");
		JButton button2 = new JButton("Delete Schedule");
		JButton button3 = new JButton("Edit Schedule");
		JButton button4 = new JButton("View Schedule");
		JButton button5 = new JButton("Exit Program");
		
		button1.addActionListener(new ButtonAddListener(frame));
		button2.addActionListener(new ButtonDeleteListener(frame));
		button3.addActionListener(new ButtonEditListener(frame));
		button4.addActionListener(new ButtonViewListener(frame));
		button5.addActionListener(new ButtonExitListener());
		
		panel1.add(label);
		panel2.add(button1);
		panel2.add(button2);
		panel2.add(button3);
		panel2.add(button4);
		panel2.add(button5);
		
		this.add(panel1, BorderLayout.NORTH);
		this.add(panel2, BorderLayout.CENTER);
	}
}
