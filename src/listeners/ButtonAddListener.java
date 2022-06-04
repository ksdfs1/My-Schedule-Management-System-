package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import gui.ScheduleAdder;
import gui.WindowFrame;

public class ButtonAddListener implements ActionListener {  //ActionListener �������̽��� ������ Ŭ����
													//action event�� �߻��ϸ� ��, add schedule ��ư�� Ŭ���ϸ� ScheduleAdder GUI�� ����.
	WindowFrame frame;  //frame�� ��ȭ�� �ֱ� ���� �ʿ��� �ʵ� ����

	public ButtonAddListener(WindowFrame frame) {  //frame�� �޾Ƽ� �ʵ� ������ �ʱ�ȭ �ϴ� ������
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {  //action event�� �߻��ϸ� ScheduleAdder panel�� frame�� ���̴� �޼ҵ�
		ScheduleAdder adder = frame.getScheduleAdder();  //ScheduleAdder ��ü�� �ּҸ� �����ͼ� adder�� ����
		frame.setupPanel(adder);  //setupPanel() �޼ҵ带 �̿��Ͽ� frame�� ����� adder(ScheduleAdder�� panel)�� frame�� ���� ����.
	}

}
