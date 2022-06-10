package event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import Schedule.ScheduleInput;
import gui.WindowFrame;
import manager.ScheduleManager;

//ScheduleEditInput GUI에서 input 버튼을 누르면 일정(객체)의 category에 따라 
//ScheduleEditor, ExamEditor, PromiseEditor 중 하나를 띄우는 listener.
public class ButtonEditInputListener implements ActionListener {
	WindowFrame frame;
	JTextField field;
	ScheduleInput schedule;
	ScheduleManager scheduleManager;
	
	public ButtonEditInputListener(WindowFrame frame, ScheduleManager scheduleManager, JTextField field) {
		this.frame = frame;
		this.scheduleManager = scheduleManager;
		this.field = field;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		schedule = scheduleManager.get(Integer.parseInt(field.getText())-1);
		frame.setSchedule(schedule);
		
		if("Course".equals(schedule.getCategory().toString())){
			frame.setupPanel(frame.getScheduleEditor());
		}else if("Assignment".equals(schedule.getCategory().toString())){
			frame.setupPanel(frame.getScheduleEditor());
		}else if("Exam".equals(schedule.getCategory().toString())){
			frame.setupPanel(frame.getExamEditor());
		}else if("Promise".equals(schedule.getCategory().toString())){
			frame.setupPanel(frame.getPromiseEditor());
		}

	}

}
