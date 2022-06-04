package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import gui.MenuSelection;
import gui.WindowFrame;

public class MenuSelectionListener implements ActionListener { //ActionListener 인터페이스를 따르는 클래스
	                                      //action event가 발생하면 즉, input, save, cancel 버튼을 클릭하면 ScheduleEditInput GUI를 띄운다.
	WindowFrame frame; //frame에 변화를 주기 위해 필요한 필드 변수
	
	public MenuSelectionListener(WindowFrame frame) { //frame을 받아서 필드 변수를 초기화 하는 생성자
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) { //action event가 발생하면 MenuSelection panel을 frame에 붙이는 메소드
		MenuSelection menu = frame.getMenuSelection(); //MenuSelection 객체의 주소를 가져와서 menu에 저장
		frame.setupPanel(menu); //setupPanel() 메소드를 이용하여 frame을 지우고 menu(MenuSelection panel)를 frame에 새로 붙임.
	}

}
