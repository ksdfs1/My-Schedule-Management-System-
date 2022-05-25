package gui;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ScheduleViewer extends JFrame { //JFrame의 상속을 받는 클래스로 일정을 
	
	public ScheduleViewer() {
		DefaultTableModel model = new DefaultTableModel();  //table model 생성
		model.addColumn("Num");  //model에 5개의 column(열)을 add
		model.addColumn("Date");
		model.addColumn("Time");
		model.addColumn("Content");
		model.addColumn("Contact Info.");
		
		JTable table = new JTable(model);  //table 생성
		JScrollPane sp = new JScrollPane(table);  //ScrollPane 생성
		
		this.add(sp);  //sp(스크롤팬)를 frame에 add
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
}
