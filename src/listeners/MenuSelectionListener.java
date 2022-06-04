package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import gui.MenuSelection;
import gui.WindowFrame;

public class MenuSelectionListener implements ActionListener { //ActionListener �������̽��� ������ Ŭ����
	                                      //action event�� �߻��ϸ� ��, input, save, cancel ��ư�� Ŭ���ϸ� ScheduleEditInput GUI�� ����.
	WindowFrame frame; //frame�� ��ȭ�� �ֱ� ���� �ʿ��� �ʵ� ����
	
	public MenuSelectionListener(WindowFrame frame) { //frame�� �޾Ƽ� �ʵ� ������ �ʱ�ȭ �ϴ� ������
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) { //action event�� �߻��ϸ� MenuSelection panel�� frame�� ���̴� �޼ҵ�
		MenuSelection menu = frame.getMenuSelection(); //MenuSelection ��ü�� �ּҸ� �����ͼ� menu�� ����
		frame.setupPanel(menu); //setupPanel() �޼ҵ带 �̿��Ͽ� frame�� ����� menu(MenuSelection panel)�� frame�� ���� ����.
	}

}
