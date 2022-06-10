package event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import gui.WindowFrame;

//�۾��� �Ϸ��Ͽ� save, cancel ���� ��ư�� ������ �� MenuSelection GUI�� ����ִ� listener.
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
