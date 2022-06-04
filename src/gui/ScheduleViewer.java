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

public class ScheduleViewer extends JPanel {  //JPanel�� ����� �޴� Ŭ������ ����Ʈ�� �ִ� ������ �����ִ� GUI�� �����.
	
	WindowFrame frame; //�����ڷ� ���� frame�� ������ �ʵ� ����
	ScheduleManager scheduleManager; //�����ڷ� ���� ScheduleManager�� ������ �ʵ� ����
											 
	public ScheduleViewer(WindowFrame frame, ScheduleManager scheduleManager) { //frame, ScheduleManager ��ü�� �޴� ������
		this.frame = frame; //���� frame���� �ʵ� ���� �ʱ�ȭ
		this.scheduleManager = scheduleManager; //���ڷ� ���� scheduleManager�� �ʵ� ���� �ʱ�ȭ 
		
		System.out.println("***" + scheduleManager.size() + "***");  //���� ���� �� ���
		
		DefaultTableModel model = new DefaultTableModel();  //table model ���� 
		model.addColumn("Num");  //model�� 5���� column(��)�� add
		model.addColumn("Date");
		model.addColumn("Time");
		model.addColumn("Content");
		
		for(int i = 0; i < scheduleManager.size(); i++) {  
			Vector row = new Vector();
			ScheduleInput si= scheduleManager.get(i); //si�� i(�ε���)�� �ش��ϴ� ��ü �ּ� ����
			row.add(i+1); //row�� ���� �ѹ� �߰�
			row.add(si.getDate()); //row�� ��¥ �߰�
			row.add(si.getTime()); //row�� �ð� �߰�
			row.add(si.getContent()); //row�� ���� �߰�
			model.addRow(row); //model�� row ����
		}
		
		JPanel panel = new JPanel();
		JButton button = new JButton("Back to Menu");
		panel.add(button);
		
		button.addActionListener(new MenuSelectionListener(frame)); //button�� ActionListener �߰�(MenuSelectionListener ��ü ����)
																	//��ư�� ������ MenuSelection GUI�� �����
		JTable table = new JTable(model);  //table ����
		JScrollPane sp = new JScrollPane(table);  //ScrollPane ����(���ڷ� table ����)
		
		this.add(sp, BorderLayout.NORTH);  //���ʿ� ����
		this.add(panel, BorderLayout.SOUTH);  //���ʿ� ����
	}
	
}
