package event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//MenuSelection GUI���� Exit Program ��ư�� ������ ���α׷��� �����ϴ� listener.
public class ButtonExitListener implements ActionListener {
	
	public ButtonExitListener() {

	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
	}

}
