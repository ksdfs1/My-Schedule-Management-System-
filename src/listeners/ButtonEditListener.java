package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import gui.ScheduleEditor;
import gui.WindowFrame;

public class ButtonEditListener implements ActionListener { //ActionListener �������̽��� ������ Ŭ����
	                              //action event�� �߻��ϸ� ��, ScheduleEditInput GUI���� input ��ư�� Ŭ���ϸ� ScheduleEditor GUI�� ����.
	WindowFrame frame; //frame�� ��ȭ�� �ֱ� ���� �ʿ��� �ʵ� ����
	
	public ButtonEditListener(WindowFrame frame) { //frame�� �޾Ƽ� �ʵ� ������ �ʱ�ȭ �ϴ� ������
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) { //action event�� �߻��ϸ� ScheduleEditor panel�� frame�� ���̴� �޼ҵ�
		ScheduleEditor editor = frame.getScheduleEditor(); //ScheduleEditor ��ü�� �ּҸ� �����ͼ� editor�� ����
		frame.setupPanel(editor); //setupPanel() �޼ҵ带 �̿��Ͽ� frame�� ����� editor(ScheduleEditor panel)�� frame�� ���� ����.
	}

}
