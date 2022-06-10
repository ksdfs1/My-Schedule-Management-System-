package gui;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import event.ScheduleAdderListener;
import manager.ScheduleManager;

//Exam 일정을 추가할 때 정보를 입력받는 GUI.
public class ExamAdder extends ScheduleAdder {  
	JTextField fieldPlace;
	
	public ExamAdder(WindowFrame frame, ScheduleManager scheduleManager) {
		super(frame, scheduleManager);
	}
	
	public void examAdder(JPanel panel) {
		JLabel labelPlace = new JLabel("Place: ", JLabel.TRAILING);
		fieldPlace = new JTextField(15);
		labelPlace.setLabelFor(fieldPlace);
		addToPanel(panel, labelPlace, fieldPlace);
	}
	
	public void addToPanel(JPanel panel, JLabel label, JTextField field) {
		panel.add(label);
		panel.add(field);
	}
	
	public void saveButtonListener(JButton saveButton) {
		saveButton.addActionListener(new ScheduleAdderListener(frame, fieldDate, fieldTime, 
															   fieldPlace, fieldContent, scheduleManager));
	}
	
	public void setLayout() {
		panel.setLayout(new SpringLayout());
		SpringUtilities.makeCompactGrid(panel, 5, 2, 6, 6, 6, 6);
	}
	
}
