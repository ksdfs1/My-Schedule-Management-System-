package gui;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ScheduleViewer extends JFrame { //JFrame�� ����� �޴� Ŭ������ ������ 
	
	public ScheduleViewer() {
		DefaultTableModel model = new DefaultTableModel();  //table model ����
		model.addColumn("Num");  //model�� 5���� column(��)�� add
		model.addColumn("Date");
		model.addColumn("Time");
		model.addColumn("Content");
		model.addColumn("Contact Info.");
		
		JTable table = new JTable(model);  //table ����
		JScrollPane sp = new JScrollPane(table);  //ScrollPane ����
		
		this.add(sp);  //sp(��ũ����)�� frame�� add
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
}
