package event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import gui.WindowFrame;

//MenuSelection GUI���� Delete Schedule ��ư�� ������ ScheduleDeleter GUI�� ����ִ� listener.
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
