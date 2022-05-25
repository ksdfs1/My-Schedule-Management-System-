package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class ScheduleAdder extends JFrame {  //JFrame의 상속을 받는 클래스로 일정(객체) 생성 시에 사용자에게 값(일정에 관한 정보)을 입력받는 GUI이다.
	                                         //사용자의 입력을 받는 텍스트 field 4개와 field들의 이름 역할을 하는 label 4개가 있다
	public ScheduleAdder() {  //생성자
		JPanel panel = new JPanel();  //panel 생성
		panel.setLayout(new SpringLayout());  //panel의 Layout을 SpringLayout으로 설정
		                                          //JLabel.TRAILING은 label의 후미를 인식하여 텍스트 field 옆에 붙게 한다.(오른쪽 정렬 같은거)
		JLabel labelNum = new JLabel("Number: ", JLabel.TRAILING);  //labelNum 생성
		JTextField fieldNum = new JTextField(10);  //10짜리 fieldNum 생성
		labelNum.setLabelFor(fieldNum);  //labelNum은 fieldNum을 위한 것이다.
		panel.add(labelNum);  //panel에 labelNum 붙임
		panel.add(fieldNum);  //panel에 fieldNum 붙임
		//같은 과정 3번 반복
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
		
		panel.add(new JButton("save"));   //panel에 save button 붙임.
		panel.add(new JButton("cancel")); //panel에 cancel button 붙임.
		
		SpringUtilities.makeCompactGrid(panel, 5, 2, 6, 6, 6, 6);  //Layout 설정
		
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setContentPane(panel);  //panel을 frame에 붙임.
		this.setVisible(true);
	}
	
}
