package event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//MenuSelection GUI에서 Exit Program 버튼을 누르면 프로그램을 종료하는 listener.
public class ButtonExitListener implements ActionListener {
	
	public ButtonExitListener() {

	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
	}

}
