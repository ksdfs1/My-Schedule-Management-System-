package gui;

import javax.swing.JButton;
import javax.swing.JTextField;

import event.ButtonEditInputListener;
import event.MenuSelectionListener;
import manager.ScheduleManager;

//������ ������ �ѹ��� �Է¹޴� GUI.
public class ScheduleEditInput extends ScheduleDeleter {
	public ScheduleEditInput(WindowFrame frame, ScheduleManager scheduleManager) {
		super(frame, scheduleManager);
	}
	
	public String getString() {
		String s = "Input the schedule Num you want to edit.";
		return s;
	}
	
	public void buttonListener(JButton button1, JButton button2, JTextField field) {
		button1.addActionListener(new ButtonEditInputListener(frame, scheduleManager, field));
		button2.addActionListener(new MenuSelectionListener(frame));
	}
}
