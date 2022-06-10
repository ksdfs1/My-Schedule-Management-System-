package gui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import event.MenuSelectionListener;
import event.ScheduleDeleterListener;
import manager.ScheduleManager;

//삭제할 일정의 넘버를 입력받는 GUI.
public class ScheduleDeleter extends JPanel {
	WindowFrame frame;
	ScheduleManager scheduleManager;
	
	public ScheduleDeleter(WindowFrame frame, ScheduleManager scheduleManager) {
		this.frame = frame;
		this.scheduleManager = scheduleManager;
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		
		JLabel label1 = new JLabel(getString());
		panel1.add(label1);
		
		JLabel label2 = new JLabel("schedule Num: ");
		JTextField field = new JTextField(5);
		label2.setLabelFor(field);
		panel2.add(label2);
		panel2.add(field);
		
		JButton button1 = new JButton("input");
		JButton button2 = new JButton("cancel");
		panel2.add(button1);
		panel2.add(button2);
		
		buttonListener(button1, button2, field);
		
		this.add(panel1, BorderLayout.NORTH);
		this.add(panel2, BorderLayout.CENTER);
	}
	
	public String getString() { //label1에 적을 문장을 리턴하는 메소드
		String s = "Input the schedule Num you want to delete.";
		return s;
	}
	
	public void buttonListener(JButton button1, JButton button2, JTextField field) { 
		button1.addActionListener(new ScheduleDeleterListener(frame, scheduleManager, field));
		button2.addActionListener(new MenuSelectionListener(frame));
	}
}
