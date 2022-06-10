package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

import Schedule.ScheduleInput;
import manager.ScheduleManager;

//panel을 생성 및 그리는 기능을 가진 Frame
//다양한 setters, getter 함수가 있다.
public class WindowFrame extends JFrame{
	MenuSelection menuSelection;
	ScheduleInput schedule;
	CategorySelection categorySelection;
	ScheduleAdder scheduleAdder;
	ExamAdder examAdder;
	PromiseAdder promiseAdder;
	ScheduleDeleter scheduleDeleter;
	ScheduleEditor scheduleEditor;
	ExamEditor examEditor;
	PromiseEditor promiseEditor;
	ScheduleEditInput scheduleEditInput;
	ScheduleViewer scheduleViewer;
	ScheduleManager scheduleManager;

	public WindowFrame(ScheduleManager scheduleManager) {
		this.setSize(500, 550);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("My Frame");
		
		this.scheduleManager = scheduleManager;
		menuSelection = new MenuSelection(this);
		categorySelection = new CategorySelection(this);
		scheduleAdder = new ScheduleAdder(this, this.scheduleManager);
		examAdder = new ExamAdder(this, this.scheduleManager);
		promiseAdder = new PromiseAdder(this, this.scheduleManager);
		scheduleDeleter = new ScheduleDeleter(this, this.scheduleManager);
		scheduleEditor = new ScheduleEditor(this, this.scheduleManager);
		examEditor = new ExamEditor(this, this.scheduleManager);
		promiseEditor = new PromiseEditor(this, this.scheduleManager);
		scheduleEditInput = new ScheduleEditInput(this, this.scheduleManager);
		scheduleViewer = new ScheduleViewer(this, this.scheduleManager);
		
		this.setupPanel(menuSelection);
		
		this.setVisible(true);
	}

	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
	}
	
	public MenuSelection getMenuSelection() {
		return menuSelection;
	}

	public void setMenuSelection(MenuSelection menuSelection) {
		this.menuSelection = menuSelection;
	}
	
	public ScheduleInput getSchedule() {
		return schedule;
	}

	public void setSchedule(ScheduleInput schedule) {
		this.schedule = schedule;
	}
	
	public CategorySelection getCategorySelection() {
		return categorySelection;
	}

	public void setCategorySelection(CategorySelection categorySelection) {
		this.categorySelection = categorySelection;
	}

	public ScheduleAdder getScheduleAdder() {
		return scheduleAdder;
	}

	public void setScheduleAdder(ScheduleAdder scheduleAdder) {
		this.scheduleAdder = scheduleAdder;
	}
	
	public ExamAdder getExamAdder() {
		return examAdder;
	}

	public void setExamAdder(ExamAdder examAdder) {
		this.examAdder = examAdder;
	}

	public PromiseAdder getPromiseAdder() {
		return promiseAdder;
	}

	public void setPromiseAdder(PromiseAdder promiseAdder) {
		this.promiseAdder = promiseAdder;
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
	
	public ExamEditor getExamEditor() {
		return examEditor;
	}

	public void setExamEditor(ExamEditor examEditor) {
		this.examEditor = examEditor;
	}

	public PromiseEditor getPromiseEditor() {
		return promiseEditor;
	}

	public void setPromiseEditor(PromiseEditor promiseEditor) {
		this.promiseEditor = promiseEditor;
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
