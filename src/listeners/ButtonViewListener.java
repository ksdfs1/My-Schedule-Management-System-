package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import gui.ScheduleViewer;
import gui.WindowFrame;

public class ButtonViewListener implements ActionListener { //ActionListener �������̽��� ������ Ŭ����
												//action event�� �߻��ϸ� ��, view schedule ��ư�� Ŭ���ϸ� ScheduleViewer GUI�� ����.
	WindowFrame frame; //frame�� ��ȭ�� �ֱ� ���� �ʿ��� �ʵ� ����

	public ButtonViewListener(WindowFrame frame) { //frame�� �޾Ƽ� �ʵ� ������ �ʱ�ȭ �ϴ� ������
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) { //action event�� �߻��ϸ� ScheduleViewer panel�� frame�� ���̴� �޼ҵ�
		ScheduleViewer viewer = frame.getScheduleViewer(); //ScheduleViewer ��ü�� �ּҸ� �����ͼ� viewer�� ����
		frame.setupPanel(viewer); //setupPanel() �޼ҵ带 �̿��Ͽ� frame�� ����� viewer(ScheduleViewer panel)�� frame�� ���� ����.

	}

}
