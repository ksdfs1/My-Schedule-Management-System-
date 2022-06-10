package event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JTextField;

import gui.WindowFrame;
import manager.ScheduleManager;

//ScheduleDeleter GUI���� input ��ư�� ������ �Է��� �ѹ��� ����(��ü)�� ����Ʈ���� �����ϴ� listener.
public class ScheduleDeleterListener implements ActionListener {
	WindowFrame frame;
	ScheduleManager scheduleManager;
	JTextField field;
	
	public ScheduleDeleterListener(WindowFrame frame, ScheduleManager scheduleManager, JTextField field) {
		this.frame = frame;
		this.scheduleManager = scheduleManager;
		this.field = field;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		scheduleManager.deleteSchedule(scheduleManager.get(Integer.parseInt(field.getText())-1));
		
		putObject(scheduleManager, "schedulemanager.ser");
		
		frame.setupPanel(frame.getMenuSelection());
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
