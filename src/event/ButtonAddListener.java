package event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import gui.WindowFrame;

//MenuSelection GUI���� Add Schedule ��ư�� ������ CategorySelection GUI�� ����ִ� listener.
public class ButtonAddListener implements ActionListener {
	WindowFrame frame;

	public ButtonAddListener(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		frame.setupPanel(frame.getCategorySelection());
	}

}
