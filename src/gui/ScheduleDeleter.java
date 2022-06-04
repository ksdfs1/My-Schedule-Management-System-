package gui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import listeners.MenuSelectionListener;

public class ScheduleDeleter extends JPanel { //JPanel�� ����� �޴� Ŭ������, ������ ������ ��ȣ(scheduleNum)�� �Է¹޴� GUI��.
											  //panel�� label�� ���� 2���� �ְ� ���ڸ� �Է¹��� field 1��, �׸��� ��ư(save, cancel) 2���� �ִ�
	WindowFrame frame;  //�����ڷ� ���� frame�� ������ �ʵ� ����
	
	public ScheduleDeleter(WindowFrame frame) {  //frame�� �޴� ������
		this.frame = frame;  //���� frame���� �ʵ� ���� �ʱ�ȭ
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		
		JLabel label1 = new JLabel(getString());
		panel1.add(label1);
		
		JLabel label2 = new JLabel("schedule Num: ");
		JTextField field = new JTextField(5);
		label2.setLabelFor(field);
		panel2.add(label2);
		panel2.add(field);
		
		JButton button1 = new JButton("input");
		JButton button2 = new JButton("cancel");
		panel2.add(button1);
		panel2.add(button2);
		
		buttonListener(button1, button2);
		
		this.add(panel1, BorderLayout.NORTH);
		this.add(panel2, BorderLayout.CENTER);
	}
	
	public String getString() { //label1�� ���� ������ �����ϴ� �޼ҵ�
		String s = "Input the schedule Num you want to delete.";
		return s;
	}
	
	public void buttonListener(JButton button1, JButton button2) {  //button�� Listener�� ���̴� �޼ҵ�
		button1.addActionListener(new MenuSelectionListener(frame)); //button1�� ActionListener �߰�(MenuSelectionListener ��ü ����)
		button2.addActionListener(new MenuSelectionListener(frame)); //button2�� ActionListener �߰�(MenuSelectionListener ��ü ����)
																	 //��ư�� ������ MenuSelection GUI�� ���ư�. 
	}
}
