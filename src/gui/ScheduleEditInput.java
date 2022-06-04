package gui;

import javax.swing.JButton;

import listeners.ButtonEditListener;
import listeners.MenuSelectionListener;

public class ScheduleEditInput extends ScheduleDeleter { //ScheduleDeleter�� ����� �޴� Ŭ������, ������ ������ ��ȣ�� �Է¹޴� GUI�̴�.
														 //ScheduleDeleter�� ������ �����̰� getString()�� buttonListener()�޼ҵ常 ������ �Ͽ���.
	public ScheduleEditInput(WindowFrame frame) {  //frame�� �޴� ������
		super(frame);  //super�� �θ� Ŭ������ ������ ȣ��
	}
	
	public String getString() { //label1�� ������ �ٸ��Ƿ� ������
		String s = "Input the schedule Num you want to edit.";
		return s;
	}
	
	public void buttonListener(JButton button1, JButton button2) { //input ��ư(button1)�� ������ �� Listener�� �ٸ��Ƿ� ������
		button1.addActionListener(new ButtonEditListener(frame)); //button1�� ActionListener �߰�(ButtonEditListener ��ü ����)
		button2.addActionListener(new MenuSelectionListener(frame)); //button2�� ActionListener �߰�(MenuSelectionListener ��ü ����)
		                               								 //button1�� ������ ScheduleEditor GUI�� �����.
																	 //button2�� ������ MenuSelection GUI�� ���ư�. 
	}
}
