package event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import Schedule.Assignment;
import Schedule.Course;
import Schedule.Exam;
import Schedule.Promise;
import Schedule.ScheduleCategory;
import Schedule.ScheduleInput;
import gui.WindowFrame;

//CategorySelection GUI에서 버튼을 누르면 category에 따라 일정(객체)를 생성하고
//ScheduleAdder, ExamAdder, PromiseAdder 중 한 GUI를 띄워주는 listener.
public class ScheduleCategoryListener implements ActionListener {
	WindowFrame frame;
	ScheduleInput schedule;
	
	public ScheduleCategoryListener(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton) e.getSource();
		if("Course".equals(b.getText())){
			schedule = new Course(ScheduleCategory.Course);
			frame.setSchedule(schedule);
			frame.setupPanel(frame.getScheduleAdder());
		}else if("Assignment".equals(b.getText())){
			schedule = new Assignment(ScheduleCategory.Assignment);
			frame.setSchedule(schedule);
			frame.setupPanel(frame.getScheduleAdder());
		}else if("Exam".equals(b.getText())){
			schedule = new Exam(ScheduleCategory.Exam);
			frame.setSchedule(schedule);
			frame.setupPanel(frame.getExamAdder());
		}else if("Promise".equals(b.getText())){
			schedule = new Promise(ScheduleCategory.Promise);
			frame.setSchedule(schedule);
			frame.setupPanel(frame.getPromiseAdder());
		}
	}
}
