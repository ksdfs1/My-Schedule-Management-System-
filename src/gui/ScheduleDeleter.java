package gui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import listeners.MenuSelectionListener;

public class ScheduleDeleter extends JPanel { //JPanel의 상속을 받는 클래스로, 삭제할 일정의 번호(scheduleNum)을 입력받는 GUI다.
											  //panel과 label이 각각 2개씩 있고 숫자를 입력받을 field 1개, 그리고 버튼(save, cancel) 2개가 있다
	WindowFrame frame;  //생성자로 받은 frame을 저장할 필드 변수
	
	public ScheduleDeleter(WindowFrame frame) {  //frame을 받는 생성자
		this.frame = frame;  //받은 frame으로 필드 변수 초기화
		
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
	
	public String getString() { //label1에 적을 문장을 리턴하는 메소드
		String s = "Input the schedule Num you want to delete.";
		return s;
	}
	
	public void buttonListener(JButton button1, JButton button2) {  //button에 Listener를 붙이는 메소드
		button1.addActionListener(new MenuSelectionListener(frame)); //button1에 ActionListener 추가(MenuSelectionListener 객체 전달)
		button2.addActionListener(new MenuSelectionListener(frame)); //button2에 ActionListener 추가(MenuSelectionListener 객체 전달)
																	 //버튼을 누르면 MenuSelection GUI로 돌아감. 
	}
}
