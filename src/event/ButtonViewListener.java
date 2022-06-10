package event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import gui.ScheduleViewer;
import gui.WindowFrame;
import manager.ScheduleManager;

//MenuSelection GUI에서 View Schedule 버튼을 누르면 ScheduleViewer GUI를 띄워주는 listener.
public class ButtonViewListener implements ActionListener {
	WindowFrame frame;
	
	public ButtonViewListener(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		ScheduleViewer scheduleViewer = frame.getScheduleViewer();
		ScheduleManager scheduleManager = getObject("schedulemanager.ser");
		scheduleViewer.setScheduleManager(scheduleManager); 
		
		frame.setupPanel(frame.getScheduleViewer());
	}

	public static ScheduleManager getObject(String fileName) {
		ScheduleManager scheduleManager = null;
		try {
			FileInputStream file = new FileInputStream(fileName);
			ObjectInputStream in = new ObjectInputStream(file);
			
			scheduleManager = (ScheduleManager)in.readObject();
			
			in.close();
			file.close();
		} catch (FileNotFoundException e) {
			return scheduleManager;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return scheduleManager;
	}
}
