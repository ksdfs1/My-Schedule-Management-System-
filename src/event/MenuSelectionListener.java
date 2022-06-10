package event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import gui.WindowFrame;

//작업을 완료하여 save, cancel 등의 버튼을 눌렀을 때 MenuSelection GUI를 띄워주는 listener.
public class MenuSelectionListener implements ActionListener {
	WindowFrame frame;
	
	public MenuSelectionListener(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		frame.setupPanel(frame.getMenuSelection());
	}

}
