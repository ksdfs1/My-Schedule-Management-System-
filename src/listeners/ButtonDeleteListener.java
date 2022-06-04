package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import gui.ScheduleDeleter;
import gui.WindowFrame;

public class ButtonDeleteListener implements ActionListener { //ActionListener �������̽��� ������ Ŭ����
												//action event�� �߻��ϸ� ��, delete schedule ��ư�� Ŭ���ϸ� ScheduleDeleter GUI�� ����.
	WindowFrame frame; //frame�� ��ȭ�� �ֱ� ���� �ʿ��� �ʵ� ����
	
	public ButtonDeleteListener(WindowFrame frame) { //frame�� �޾Ƽ� �ʵ� ������ �ʱ�ȭ �ϴ� ������
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) { //action event�� �߻��ϸ� ScheduleDeleter panel�� frame�� ���̴� �޼ҵ�
		ScheduleDeleter deleter = frame.getScheduleDeleter(); //ScheduleDeleter ��ü�� �ּҸ� �����ͼ� deleter�� ����
		frame.setupPanel(deleter); //setupPanel() �޼ҵ带 �̿��Ͽ� frame�� ����� deleter(ScheduleDeleter�� panel)�� frame�� ���� ����.
	}

}
