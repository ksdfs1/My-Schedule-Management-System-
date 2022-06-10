package gui;

import javax.swing.JButton;

import event.ScheduleEditorListener;
import manager.ScheduleManager;

//Exam ������ ������ �� ������ �Է¹޴� GUI.
public class ExamEditor extends ExamAdder {  
	
	public ExamEditor(WindowFrame frame, ScheduleManager scheduleManager) {
		super(frame, scheduleManager);
	}
	
	public void saveButtonListener(JButton saveButton) {
		saveButton.addActionListener(new ScheduleEditorListener(frame, fieldDate, fieldTime, 
															   fieldPlace, fieldContent, scheduleManager));
	}
}
