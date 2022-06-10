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

//CategorySelection GUI���� ��ư�� ������ category�� ���� ����(��ü)�� �����ϰ�
//ScheduleAdder, ExamAdder, PromiseAdder �� �� GUI�� ����ִ� listener.
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
