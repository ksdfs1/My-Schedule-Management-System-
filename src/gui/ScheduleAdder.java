package gui;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import event.MenuSelectionListener;
import event.ScheduleAdderListener;
import manager.ScheduleManager;

//기본 일정(Course, Assignment)을 추가할 때 정보를 입력받는 GUI.
public class ScheduleAdder extends JPanel {  
	WindowFrame frame;
	ScheduleManager scheduleManager;
	JPanel panel;
	JTextField fieldDate;
	JTextField fieldTime;
	JTextField fieldContent;
	
	public ScheduleAdder(WindowFrame frame, ScheduleManager scheduleManager) {
		this.frame = frame;
		this.scheduleManager = scheduleManager;
		
		panel = new JPanel();
		
		JLabel labelDate = new JLabel("Date: ", JLabel.TRAILING);
		fieldDate = new JTextField(15);
		labelDate.setLabelFor(fieldDate);
		
		JLabel labelTime = new JLabel("Time: ", JLabel.TRAILING);
		fieldTime = new JTextField(15);
		labelTime.setLabelFor(fieldTime);
		
		JLabel labelContent = new JLabel("Content: ", JLabel.TRAILING);
		fieldContent = new JTextField(15);
		labelContent.setLabelFor(fieldContent);
		
		addToPanel(panel, labelDate, fieldDate);
		addToPanel(panel, labelTime, fieldTime);
		examAdder(panel);
		promiseAdder(panel);
		addToPanel(panel, labelContent, fieldContent);
		
		JButton saveButton = new JButton("save");
		JButton cancelButton = new JButton("cancel");
		
		panel.add(saveButton);
		panel.add(cancelButton);
		
		saveButtonListener(saveButton);
		cancelButton.addActionListener(new MenuSelectionListener(frame));

		setLayout();
		this.add(panel);
	}
	
	public void examAdder(JPanel panel) {}
	
	public void promiseAdder(JPanel panel) {}
	
	public void addToPanel(JPanel panel, JLabel label, JTextField field) {
		panel.add(label);
		panel.add(field);
	}
	
	public void saveButtonListener(JButton saveButton) {
		saveButton.addActionListener(new ScheduleAdderListener(frame, fieldDate, fieldTime,
															   fieldContent, scheduleManager));
	}
	
	public void setLayout() {
		panel.setLayout(new SpringLayout());
		SpringUtilities.makeCompactGrid(panel, 4, 2, 6, 6, 6, 6);
	}
	
}
