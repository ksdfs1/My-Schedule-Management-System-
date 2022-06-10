package event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import gui.WindowFrame;

//MenuSelection GUI에서 Delete Schedule 버튼을 누르면 ScheduleDeleter GUI를 띄워주는 listener.
public class ButtonDeleteListener implements ActionListener {
	WindowFrame frame;
	
	public ButtonDeleteListener(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		frame.setupPanel(frame.getScheduleDeleter());
	}
}
