package gui;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

import event.ScheduleCategoryListener;

//추가할 일정(객체)의 카테고리를 고를 수 있는 GUI.
public class CategorySelection extends JPanel {
	WindowFrame frame;
	
	public CategorySelection(WindowFrame frame) {
		this.frame = frame;
		
		JPanel panel = new JPanel();
		
		JLabel label = new JLabel("Select a schedule category.");
		JButton button1 = new JButton("Course");
		JButton button2 = new JButton("Assignment");
		JButton button3 = new JButton("Exam");
		JButton button4 = new JButton("Promise");
		
		button1.addActionListener(new ScheduleCategoryListener(frame));
		button2.addActionListener(new ScheduleCategoryListener(frame));
		button3.addActionListener(new ScheduleCategoryListener(frame));
		button4.addActionListener(new ScheduleCategoryListener(frame));
		
		panel.add(label);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		
		panel.setLayout(new SpringLayout());
		SpringUtilities.makeCompactGrid(panel, 5, 1, 6, 6, 6, 6);
		this.add(panel);
	}

}
