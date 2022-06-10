package gui;

import javax.swing.JButton;
import javax.swing.SpringLayout;

import event.ScheduleEditorListener;
import manager.ScheduleManager;

//기본 일정(Course, Assignment)을 편집할 때 정보를 입력받는 GUI.
public class ScheduleEditor extends ScheduleAdder {
	
	public ScheduleEditor(WindowFrame frame, ScheduleManager scheduleManager) {
		super(frame, scheduleManager);
	}
	
	public void saveButtonListener(JButton saveButton) {
		 saveButton.addActionListener(new ScheduleEditorListener(frame, fieldDate, fieldTime,
																	fieldContent, scheduleManager));
	}
	
	public void setLayout() {
			panel.setLayout(new SpringLayout());
			SpringUtilities.makeCompactGrid(panel, 4, 2, 6, 6, 6, 6);
	}
}
