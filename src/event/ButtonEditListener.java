package event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import gui.WindowFrame;

//MenuSelection GUI에서 Edit Schedule 버튼을 누르면 ScheduleEditInput GUI를 띄워주는 listener.
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
