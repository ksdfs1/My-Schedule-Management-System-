package gui;

import java.awt.BorderLayout;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Schedule.ScheduleInput;
import listeners.MenuSelectionListener;
import manager.ScheduleManager;

public class ScheduleViewer extends JPanel {  //JPanel의 상속을 받는 클래스로 리스트에 있는 일정을 보여주는 GUI를 만든다.
	
	WindowFrame frame; //생성자로 받은 frame을 저장할 필드 변수
	ScheduleManager scheduleManager; //생성자로 받은 ScheduleManager를 저장할 필드 변수
											 
	public ScheduleViewer(WindowFrame frame, ScheduleManager scheduleManager) { //frame, ScheduleManager 객체를 받는 생성자
		this.frame = frame; //받은 frame으로 필드 변수 초기화
		this.scheduleManager = scheduleManager; //인자로 받은 scheduleManager로 필드 변수 초기화 
		
		System.out.println("***" + scheduleManager.size() + "***");  //현재 일정 수 출력
		
		DefaultTableModel model = new DefaultTableModel();  //table model 생성 
		model.addColumn("Num");  //model에 5개의 column(열)을 add
		model.addColumn("Date");
		model.addColumn("Time");
		model.addColumn("Content");
		
		for(int i = 0; i < scheduleManager.size(); i++) {  
			Vector row = new Vector();
			ScheduleInput si= scheduleManager.get(i); //si에 i(인덱스)에 해당하는 객체 주소 저장
			row.add(i+1); //row에 일정 넘버 추가
			row.add(si.getDate()); //row에 날짜 추가
			row.add(si.getTime()); //row에 시간 추가
			row.add(si.getContent()); //row에 내용 추가
			model.addRow(row); //model에 row 붙임
		}
		
		JPanel panel = new JPanel();
		JButton button = new JButton("Back to Menu");
		panel.add(button);
		
		button.addActionListener(new MenuSelectionListener(frame)); //button에 ActionListener 추가(MenuSelectionListener 객체 전달)
																	//버튼을 누르면 MenuSelection GUI가 띄워짐
		JTable table = new JTable(model);  //table 생성
		JScrollPane sp = new JScrollPane(table);  //ScrollPane 생성(인자로 table 전달)
		
		this.add(sp, BorderLayout.NORTH);  //북쪽에 붙임
		this.add(panel, BorderLayout.SOUTH);  //남쪽에 붙임
	}
	
}
