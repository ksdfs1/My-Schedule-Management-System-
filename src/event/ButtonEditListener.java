package event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import gui.WindowFrame;

//MenuSelection GUI���� Edit Schedule ��ư�� ������ ScheduleEditInput GUI�� ����ִ� listener.
public class ButtonEditListener implements ActionListener {
	WindowFrame frame;
	
	public ButtonEditListener(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		frame.setupPanel(frame.getScheduleEditInput());
	}
}
