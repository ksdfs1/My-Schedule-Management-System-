package gui;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import event.ScheduleEditorListener;
import manager.ScheduleManager;

//Promise ������ ������ �� ������ �Է¹޴� GUI.
public class PromiseEditor extends PromiseAdder {  
	
	public PromiseEditor(WindowFrame frame, ScheduleManager scheduleManager) {
		super(frame, scheduleManager);
	}
	
	public void saveButtonListener(JButton saveButton) {
		saveButton.addActionListener(new ScheduleEditorListener(frame, fieldDate, fieldTime, fieldPlace,
													 		   fieldWho, fieldContent, scheduleManager));
	}
	
}
