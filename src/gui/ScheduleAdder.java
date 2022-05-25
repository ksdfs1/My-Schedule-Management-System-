package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class ScheduleAdder extends JFrame {  //JFrame�� ����� �޴� Ŭ������ ����(��ü) ���� �ÿ� ����ڿ��� ��(������ ���� ����)�� �Է¹޴� GUI�̴�.
	                                         //������� �Է��� �޴� �ؽ�Ʈ field 4���� field���� �̸� ������ �ϴ� label 4���� �ִ�
	public ScheduleAdder() {  //������
		JPanel panel = new JPanel();  //panel ����
		panel.setLayout(new SpringLayout());  //panel�� Layout�� SpringLayout���� ����
		                                          //JLabel.TRAILING�� label�� �Ĺ̸� �ν��Ͽ� �ؽ�Ʈ field ���� �ٰ� �Ѵ�.(������ ���� ������)
		JLabel labelNum = new JLabel("Number: ", JLabel.TRAILING);  //labelNum ����
		JTextField fieldNum = new JTextField(10);  //10¥�� fieldNum ����
		labelNum.setLabelFor(fieldNum);  //labelNum�� fieldNum�� ���� ���̴�.
		panel.add(labelNum);  //panel�� labelNum ����
		panel.add(fieldNum);  //panel�� fieldNum ����
		//���� ���� 3�� �ݺ�
		JLabel labelDate = new JLabel("Date: ", JLabel.TRAILING);
		JTextField fieldDate = new JTextField(10);
		labelDate.setLabelFor(fieldDate);
		panel.add(labelDate);
		panel.add(fieldDate);
		
		JLabel labelTime = new JLabel("Time: ", JLabel.TRAILING);
		JTextField fieldTime = new JTextField(10);
		labelTime.setLabelFor(fieldTime);
		panel.add(labelTime);
		panel.add(fieldTime);
		
		JLabel labelContent = new JLabel("Content: ", JLabel.TRAILING);
		JTextField fieldContent = new JTextField(10);
		labelContent.setLabelFor(fieldContent);
		panel.add(labelContent);
		panel.add(fieldContent);
		
		panel.add(new JButton("save"));   //panel�� save button ����.
		panel.add(new JButton("cancel")); //panel�� cancel button ����.
		
		SpringUtilities.makeCompactGrid(panel, 5, 2, 6, 6, 6, 6);  //Layout ����
		
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setContentPane(panel);  //panel�� frame�� ����.
		this.setVisible(true);
	}
	
}
