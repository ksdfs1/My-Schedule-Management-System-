package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

import manager.ScheduleManager;

public class WindowFrame extends JFrame{
	MenuSelection menuSelection;  //panel 객체의 주소 저장할 변수들을 선언
	ScheduleAdder scheduleAdder;
	ScheduleDeleter scheduleDeleter;
	ScheduleEditor scheduleEditor;
	ScheduleEditInput scheduleEditInput;
	ScheduleViewer scheduleViewer;
	ScheduleManager scheduleManager;  //생성자로 받은 ScheduleManager 객체의 주소를 저장할 변수 선언
	
	public WindowFrame(ScheduleManager scheduleManager) {  //ScheduleManager 객체를 받는 생성자
		                                                   //각 panel 객체들이 생성되고 menuSelection panel이 frame에 붙는다.
		this.setSize(500, 550);  //frame 크기 설정
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //frame을 닫으면 프로그램 종료
		this.setTitle("My Frame");
		
		this.scheduleManager = scheduleManager;  //인자로 받은 scheduleManager로 필드 변수 초기화 
		menuSelection = new MenuSelection(this);  //모든 panel 객체들을 생성
		scheduleAdder = new ScheduleAdder(this);
		scheduleDeleter = new ScheduleDeleter(this);
		scheduleEditor = new ScheduleEditor(this);
		scheduleEditInput = new ScheduleEditInput(this);
		scheduleViewer = new ScheduleViewer(this, this.scheduleManager);
		
		this.setupPanel(menuSelection);
		
		this.setVisible(true);  //frame(윈도우)이 화면상에 보이게 함
	}

	public void setupPanel(JPanel panel) {  //frame을 완전히 지우고 새로 panel을 붙이는 메소드
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
	}
	//아래는 모든 panel 객체들의 setter, getter 메소드이다.
	public MenuSelection getMenuSelection() {
		return menuSelection;
	}

	public void setMenuSelection(MenuSelection menuSelection) {
		this.menuSelection = menuSelection;
	}

	public ScheduleAdder getScheduleAdder() {
		return scheduleAdder;
	}

	public void setScheduleAdder(ScheduleAdder scheduleAdder) {
		this.scheduleAdder = scheduleAdder;
	}
	
	public ScheduleDeleter getScheduleDeleter() {
		return scheduleDeleter;
	}

	public void setScheduleDeleter(ScheduleDeleter scheduleDeleter) {
		this.scheduleDeleter = scheduleDeleter;
	}
	
	public ScheduleEditor getScheduleEditor() {
		return scheduleEditor;
	}

	public void setScheduleEditor(ScheduleEditor scheduleEditor) {
		this.scheduleEditor = scheduleEditor;
	}
	
	public ScheduleEditInput getScheduleEditInput() {
		return scheduleEditInput;
	}

	public void setScheduleEditInput(ScheduleEditInput scheduleEditInput) {
		this.scheduleEditInput = scheduleEditInput;
	}

	public ScheduleViewer getScheduleViewer() {
		return scheduleViewer;
	}

	public void setScheduleViewer(ScheduleViewer scheduleViewer) {
		this.scheduleViewer = scheduleViewer;
	}

}
