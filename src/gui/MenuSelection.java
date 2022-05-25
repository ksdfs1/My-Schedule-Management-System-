package gui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MenuSelection extends JFrame {  //JFrame�� ����� �޴� Ŭ������ �޴��� ���̴� gui�̸� ��ư�� ���� �Է��� �޴´�.
										     //���� ������ ���̺�(Menu Selection)�� �ְ� �� �Ʒ��� �޴��� ��Ÿ���� ��ư 5���� �ִ�.
	public MenuSelection() {  //������
		this.setSize(300, 200);  //frame ũ�� ����
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //frame�� ������ ���α׷� ����
		
		JPanel panel1 = new JPanel();  //label�� ���� panel1 ����
		JPanel panel2 = new JPanel();  //button���� paenl2 ����
		JLabel label = new JLabel("Menu Selection");  //label ����
		
		JButton button1 = new JButton("Add Schedule");    //button 5�� ����
		JButton button2 = new JButton("Delete Schedule");
		JButton button3 = new JButton("Edit Schedule");
		JButton button4 = new JButton("View Schedule");
		JButton button5 = new JButton("Exit Program");
		
		panel1.add(label);   //label�� panel1�� add
		panel2.add(button1); //button���� panel2�� add
		panel2.add(button2);
		panel2.add(button3);
		panel2.add(button4);
		panel2.add(button5);
		
		this.add(panel1, BorderLayout.NORTH);  //panel1�� ���ʿ� ���̰�
		this.add(panel2, BorderLayout.CENTER); //panel2�� ���Ϳ� ����.
		this.setVisible(true);  //frame(������)�� ȭ��� ���̰� ��
	}
}
