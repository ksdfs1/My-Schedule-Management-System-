package event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JTextField;

import Schedule.ScheduleInput;
import exception.TimeFormatException;
import gui.WindowFrame;
import manager.ScheduleManager;

//ScheduleAdder, ExamAdder, PromiseAdder GUI에서 save 버튼을 누르면 입력받은 모든 정보를 일정(객체)에 입력하고 파일에 올리는 listener.
//또한 해당 일정을 리스트에 추가한다.
public class ScheduleAdderListener implements ActionListener {
	WindowFrame frame;
	JTextField fieldDate;
	JTextField fieldTime;
	JTextField fieldPlace;
	JTextField fieldWho;
	JTextField fieldContent;
	ScheduleManager scheduleManager;
	
	public ScheduleAdderListener(WindowFrame frame, JTextField fieldDate, JTextField fieldTime,
								 JTextField fieldContent, ScheduleManager scheduleManager) {
		this.frame = frame;
		this.fieldDate = fieldDate;
		this.fieldTime = fieldTime;
		this.fieldContent = fieldContent;
		this.scheduleManager = scheduleManager;
	}
	public ScheduleAdderListener(WindowFrame frame, JTextField fieldDate, JTextField fieldTime,
			 					 JTextField fieldPlace, JTextField fieldContent, ScheduleManager scheduleManager) {
		this(frame, fieldDate, fieldTime, fieldContent, scheduleManager);
		this.fieldPlace = fieldPlace;
	}
	public ScheduleAdderListener(WindowFrame frame, JTextField fieldDate, JTextField fieldTime, JTextField fieldPlace, 
			 					 JTextField fieldWho, JTextField fieldContent, ScheduleManager scheduleManager) {
		this(frame, fieldDate, fieldTime, fieldPlace, fieldContent, scheduleManager);
		this.fieldWho = fieldWho;
	}

	@Override
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
			scheduleManager.addSchedule(schedule);
			putObject(scheduleManager, "schedulemanager.ser");
			
			frame.setupPanel(frame.getMenuSelection());
			
		} catch (TimeFormatException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
	public static void putObject(ScheduleManager scheduleManager, String fileName) {
		try {
			FileOutputStream file = new FileOutputStream(fileName);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(scheduleManager);
			
			out.close();
			file.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
