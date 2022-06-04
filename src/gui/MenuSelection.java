package gui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import listeners.ButtonAddListener;
import listeners.ButtonDeleteListener;
import listeners.ButtonEditInputListener;
import listeners.ButtonViewListener;

public class MenuSelection extends JPanel {  //JPanel�� ����� �޴� Ŭ������ �޴��� ���̴� gui�̸� ��ư�� ���� �Է��� �޴´�.
										     //���� ������ ���̺�(Menu Selection)�� �ְ� �� �Ʒ��� �޴��� ��Ÿ���� ��ư 5���� �ִ�.
		WindowFrame frame;  //�����ڷ� ���� frame�� ������ �ʵ� ����
		
	public MenuSelection(WindowFrame frame) {  //frame�� �޴� ������
		this.frame = frame;  //���� frame���� �ʵ� ���� �ʱ�ȭ
		
		this.setLayout(new BorderLayout());
		
		JPanel panel1 = new JPanel();  //label�� ���� panel1 ����
		JPanel panel2 = new JPanel();  //button���� paenl2 ����
		JLabel label = new JLabel("Menu Selection");  //label ����
		
		JButton button1 = new JButton("Add Schedule");    //button 5�� ����
		JButton button2 = new JButton("Delete Schedule");
		JButton button3 = new JButton("Edit Schedule");
		JButton button4 = new JButton("View Schedule");
		JButton button5 = new JButton("Exit Program");
		
		button1.addActionListener(new ButtonAddListener(frame));  //button1�� ActionListener �߰� (ButtonAddListener ��ü�� ����)
		button2.addActionListener(new ButtonDeleteListener(frame));  //button2�� ActionListener �߰� (ButtonDeleteListener ��ü�� ����)
		button3.addActionListener(new ButtonEditInputListener(frame));  //button3�� ActionListener �߰� (ButtonEditInputListener ��ü�� ����)
		button4.addActionListener(new ButtonViewListener(frame)); //button4�� ActionListener �߰� (ButtonViewListener ��ü�� ����)
																 //��ư�� ������ �ش� GUI�� frame�� ���.
		panel1.add(label);   //label�� panel1�� add
		panel2.add(button1); //button���� panel2�� add
		panel2.add(button2);
		panel2.add(button3);
		panel2.add(button4);
		panel2.add(button5);
		
		this.add(panel1, BorderLayout.NORTH);  //panel1�� ���ʿ� ���̰�
		this.add(panel2, BorderLayout.CENTER); //panel2�� ���Ϳ� ����.
	}
}
