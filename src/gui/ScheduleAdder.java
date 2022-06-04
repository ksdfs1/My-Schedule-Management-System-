package gui;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import listeners.MenuSelectionListener;

public class ScheduleAdder extends JPanel {  //JPanel의 상속을 받는 클래스로 일정(객체) 생성 시에 사용자에게 값(일정에 관한 정보)을 입력받는 GUI이다.
	                                         //사용자의 입력을 받는 텍스트 field 4개와 field들의 이름 역할을 하는 label 4개가 있다
	WindowFrame frame;  //생성자로 받은 frame을 저장할 필드 변수
	
	public ScheduleAdder(WindowFrame frame) {  //frame을 받는 생성자
		this.frame = frame;  //받은 frame으로 필드 변수 초기화
		
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
		
		JButton button1 = new JButton("save");
		JButton button2 = new JButton("cancel");
		panel.add(button1);
		panel.add(button2);
		
		button1.addActionListener(new MenuSelectionListener(frame)); //button1에 addActionListener 추가(MenuSelectionListener 객체 전달)
		button2.addActionListener(new MenuSelectionListener(frame)); //button2에 addActionListener 추가(MenuSelectionListener 객체 전달)
																	 //save 또는 cancel 버튼을 누르면 MenuSelection GUI로 돌아감.
		SpringUtilities.makeCompactGrid(panel, 5, 2, 6, 6, 6, 6);  //Layout 설정
		
		this.add(panel);  //panel을 frame에 붙임.
	}
	
}
