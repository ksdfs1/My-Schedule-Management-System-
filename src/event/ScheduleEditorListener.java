package event;

import java.awt.event.ActionEvent;

import javax.swing.JTextField;

import Schedule.ScheduleInput;
import exception.TimeFormatException;
import gui.WindowFrame;
import manager.ScheduleManager;

//ScheduleEditor, ExamEditor, PromiseEditor GUI에서 save 버튼을 누르면 입력한 모든 정보를 일정(객체)에 저장하고 파일에 올리는 listener.
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
