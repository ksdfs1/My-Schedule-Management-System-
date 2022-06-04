package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import gui.ScheduleEditInput;
import gui.WindowFrame;

public class ButtonEditInputListener implements ActionListener {//ActionListener �������̽��� ������ Ŭ����
	                                           //action event�� �߻��ϸ� ��, edit schedule ��ư�� Ŭ���ϸ� ScheduleEditInput GUI�� ����.
	WindowFrame frame; //frame�� ��ȭ�� �ֱ� ���� �ʿ��� �ʵ� ����
	
	public ButtonEditInputListener(WindowFrame frame) { //frame�� �޾Ƽ� �ʵ� ������ �ʱ�ȭ �ϴ� ������
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) { //action event�� �߻��ϸ� ScheduleEditInput panel�� frame�� ���̴� �޼ҵ�
		ScheduleEditInput editInput = frame.getScheduleEditInput(); //ScheduleEditInput ��ü�� �ּҸ� �����ͼ� editInput�� ����
		frame.setupPanel(editInput); //setupPanel() �޼ҵ带 �̿��Ͽ� frame�� ����� editInput(ScheduleEditInput panel)�� frame�� ���� ����.

	}

}
