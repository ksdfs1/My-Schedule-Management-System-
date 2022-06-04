package gui;

import javax.swing.JButton;

import listeners.ButtonEditListener;
import listeners.MenuSelectionListener;

public class ScheduleEditInput extends ScheduleDeleter { //ScheduleDeleter의 상속을 받는 클래스로, 편집할 일정의 번호를 입력받는 GUI이다.
														 //ScheduleDeleter와 동일한 형태이고 getString()와 buttonListener()메소드만 재정의 하였다.
	public ScheduleEditInput(WindowFrame frame) {  //frame을 받는 생성자
		super(frame);  //super로 부모 클래스의 생성자 호출
	}
	
	public String getString() { //label1의 문장이 다르므로 재정의
		String s = "Input the schedule Num you want to edit.";
		return s;
	}
	
	public void buttonListener(JButton button1, JButton button2) { //input 버튼(button1)을 눌렀을 때 Listener가 다르므로 재정의
		button1.addActionListener(new ButtonEditListener(frame)); //button1에 ActionListener 추가(ButtonEditListener 객체 전달)
		button2.addActionListener(new MenuSelectionListener(frame)); //button2에 ActionListener 추가(MenuSelectionListener 객체 전달)
		                               								 //button1을 누르면 ScheduleEditor GUI가 띄워짐.
																	 //button2을 누르면 MenuSelection GUI로 돌아감. 
	}
}
