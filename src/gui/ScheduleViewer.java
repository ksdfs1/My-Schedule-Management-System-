package gui;

import java.awt.BorderLayout;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Schedule.ScheduleInput;
import event.MenuSelectionListener;
import manager.ScheduleManager;

//현재 리스트에 존재하는 일정을 Table 형태로 보여주는 GUI.
public class ScheduleViewer extends JPanel {
	WindowFrame frame;
	ScheduleManager scheduleManager;
	JPanel panel;

	public ScheduleViewer(WindowFrame frame, ScheduleManager scheduleManager) { 
		this.frame = frame;
		this.scheduleManager = scheduleManager;
		
		System.out.println("***" + scheduleManager.size() + "***");
		
		panel = new JPanel();
		JButton button = new JButton("Back to Menu");
		panel.add(button);
		
		writeTable(panel);
		
		button.addActionListener(new MenuSelectionListener(frame));
	}
	
	public void writeTable(JPanel panel) {
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Num");
		model.addColumn("Category");
		model.addColumn("Date");
		model.addColumn("Time");
		model.addColumn("Place");
		model.addColumn("With who?");
		model.addColumn("Content");
		try {
			for(int i = 0; i < scheduleManager.size(); i++) {  
				Vector row = new Vector();
				ScheduleInput si = scheduleManager.get(i);
				row.add(i+1);
				row.add(si.getCategory());
				row.add(si.getDate());
				row.add(si.getTime());
				if(si.getPlace() == null)
					row.add("         -");
				else row.add(si.getPlace());
				if(si.getWho() == null)
					row.add("         -");
				else row.add(si.getWho());
				row.add(si.getContent());
				model.addRow(row);
			}
		}catch(NullPointerException e) {
			System.out.println();
			System.out.println("There is no schedule.");
		}
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		this.add(sp, BorderLayout.NORTH);
		this.add(panel, BorderLayout.SOUTH);
	}
	
	public ScheduleManager getScheduleManager() {
		return scheduleManager;
	}

	public void setScheduleManager(ScheduleManager scheduleManager) {
		this.removeAll();
		this.scheduleManager = scheduleManager;
		
		writeTable(panel);
	}
}