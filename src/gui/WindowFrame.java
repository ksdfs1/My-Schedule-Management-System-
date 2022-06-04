package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

import manager.ScheduleManager;

public class WindowFrame extends JFrame{
	MenuSelection menuSelection;  //panel ��ü�� �ּ� ������ �������� ����
	ScheduleAdder scheduleAdder;
	ScheduleDeleter scheduleDeleter;
	ScheduleEditor scheduleEditor;
	ScheduleEditInput scheduleEditInput;
	ScheduleViewer scheduleViewer;
	ScheduleManager scheduleManager;  //�����ڷ� ���� ScheduleManager ��ü�� �ּҸ� ������ ���� ����
	
	public WindowFrame(ScheduleManager scheduleManager) {  //ScheduleManager ��ü�� �޴� ������
		                                                   //�� panel ��ü���� �����ǰ� menuSelection panel�� frame�� �ٴ´�.
		this.setSize(500, 550);  //frame ũ�� ����
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //frame�� ������ ���α׷� ����
		this.setTitle("My Frame");
		
		this.scheduleManager = scheduleManager;  //���ڷ� ���� scheduleManager�� �ʵ� ���� �ʱ�ȭ 
		menuSelection = new MenuSelection(this);  //��� panel ��ü���� ����
		scheduleAdder = new ScheduleAdder(this);
		scheduleDeleter = new ScheduleDeleter(this);
		scheduleEditor = new ScheduleEditor(this);
		scheduleEditInput = new ScheduleEditInput(this);
		scheduleViewer = new ScheduleViewer(this, this.scheduleManager);
		
		this.setupPanel(menuSelection);
		
		this.setVisible(true);  //frame(������)�� ȭ��� ���̰� ��
	}

	public void setupPanel(JPanel panel) {  //frame�� ������ ����� ���� panel�� ���̴� �޼ҵ�
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
	}
	//�Ʒ��� ��� panel ��ü���� setter, getter �޼ҵ��̴�.
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
