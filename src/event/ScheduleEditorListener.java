package event;

import java.awt.event.ActionEvent;

import javax.swing.JTextField;

import Schedule.ScheduleInput;
import exception.TimeFormatException;
import gui.WindowFrame;
import manager.ScheduleManager;

//ScheduleEditor, ExamEditor, PromiseEditor GUI���� save ��ư�� ������ �Է��� ��� ������ ����(��ü)�� �����ϰ� ���Ͽ� �ø��� listener.
public class ScheduleEditorListener extends ScheduleAdderListener {
	
	public ScheduleEditorListener(WindowFrame frame, JTextField fieldDate, JTextField fieldTime,
								  JTextField fieldContent, ScheduleManager scheduleManager) {
		super(frame, fieldDate, fieldTime, fieldContent, scheduleManager);
	}
	public ScheduleEditorListener(WindowFrame frame, JTextField fieldDate, JTextField fieldTime,
								  JTextField fieldPlace, JTextField fieldContent, ScheduleManager scheduleManager) {
		super(frame, fieldDate, fieldTime, fieldPlace, fieldContent, scheduleManager);
	}
	public ScheduleEditorListener(WindowFrame frame, JTextField fieldDate, JTextField fieldTime,
								  JTextField fieldPlace, JTextField fieldWho, JTextField fieldContent, 
								  ScheduleManager scheduleManager) {
		super(frame, fieldDate, fieldTime, fieldPlace, fieldWho, fieldContent, scheduleManager);
	}

	public void actionPerformed(ActionEvent e) {
		try {
			ScheduleInput schedule = frame.getSchedule();
			
			schedule.setDate(Integer.parseInt(fieldDate.getText()));
			schedule.setTime(fieldTime.getText());
			schedule.setContent(fieldContent.getText());
			if("Exam".equals(schedule.getCategory().toString())){
				schedule.setPlace(fieldPlace.getText());
			}else if("Promise".equals(schedule.getCategory().toString())){
				schedule.setPlace(fieldPlace.getText());
				schedule.setWho(fieldWho.getText());
			}
			System.out.println();
			schedule.printInfo();
			putObject(scheduleManager, "schedulemanager.ser");
			
			frame.setupPanel(frame.getMenuSelection());
			
		} catch (TimeFormatException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

}
