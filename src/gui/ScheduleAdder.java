package gui;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import listeners.MenuSelectionListener;

public class ScheduleAdder extends JPanel {  //JPanel�� ����� �޴� Ŭ������ ����(��ü) ���� �ÿ� ����ڿ��� ��(������ ���� ����)�� �Է¹޴� GUI�̴�.
	                                         //������� �Է��� �޴� �ؽ�Ʈ field 4���� field���� �̸� ������ �ϴ� label 4���� �ִ�
	WindowFrame frame;  //�����ڷ� ���� frame�� ������ �ʵ� ����
	
	public ScheduleAdder(WindowFrame frame) {  //frame�� �޴� ������
		this.frame = frame;  //���� frame���� �ʵ� ���� �ʱ�ȭ
		
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
		
		JButton button1 = new JButton("save");
		JButton button2 = new JButton("cancel");
		panel.add(button1);
		panel.add(button2);
		
		button1.addActionListener(new MenuSelectionListener(frame)); //button1�� addActionListener �߰�(MenuSelectionListener ��ü ����)
		button2.addActionListener(new MenuSelectionListener(frame)); //button2�� addActionListener �߰�(MenuSelectionListener ��ü ����)
																	 //save �Ǵ� cancel ��ư�� ������ MenuSelection GUI�� ���ư�.
		SpringUtilities.makeCompactGrid(panel, 5, 2, 6, 6, 6, 6);  //Layout ����
		
		this.add(panel);  //panel�� frame�� ����.
	}
	
}
