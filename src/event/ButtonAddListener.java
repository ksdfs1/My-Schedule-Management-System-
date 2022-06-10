package event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import gui.WindowFrame;

//MenuSelection GUI에서 Add Schedule 버튼을 누르면 CategorySelection GUI를 띄워주는 listener.
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
