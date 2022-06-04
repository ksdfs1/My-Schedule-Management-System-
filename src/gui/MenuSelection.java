package gui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import listeners.ButtonAddListener;
import listeners.ButtonDeleteListener;
import listeners.ButtonEditInputListener;
import listeners.ButtonViewListener;

public class MenuSelection extends JPanel {  //JPanel의 상속을 받는 클래스로 메뉴를 보이는 gui이며 버튼을 통해 입력을 받는다.
										     //가장 위에는 레이블(Menu Selection)이 있고 그 아래는 메뉴를 나타내는 버튼 5개가 있다.
		WindowFrame frame;  //생성자로 받은 frame을 저장할 필드 변수
		
	public MenuSelection(WindowFrame frame) {  //frame을 받는 생성자
		this.frame = frame;  //받은 frame으로 필드 변수 초기화
		
		this.setLayout(new BorderLayout());
		
		JPanel panel1 = new JPanel();  //label을 붙일 panel1 생성
		JPanel panel2 = new JPanel();  //button들을 paenl2 생성
		JLabel label = new JLabel("Menu Selection");  //label 생성
		
		JButton button1 = new JButton("Add Schedule");    //button 5개 생성
		JButton button2 = new JButton("Delete Schedule");
		JButton button3 = new JButton("Edit Schedule");
		JButton button4 = new JButton("View Schedule");
		JButton button5 = new JButton("Exit Program");
		
		button1.addActionListener(new ButtonAddListener(frame));  //button1에 ActionListener 추가 (ButtonAddListener 객체를 전달)
		button2.addActionListener(new ButtonDeleteListener(frame));  //button2에 ActionListener 추가 (ButtonDeleteListener 객체를 전달)
		button3.addActionListener(new ButtonEditInputListener(frame));  //button3에 ActionListener 추가 (ButtonEditInputListener 객체를 전달)
		button4.addActionListener(new ButtonViewListener(frame)); //button4에 ActionListener 추가 (ButtonViewListener 객체를 전달)
																 //버튼을 누르면 해당 GUI가 frame에 뜬다.
		panel1.add(label);   //label을 panel1에 add
		panel2.add(button1); //button들을 panel2에 add
		panel2.add(button2);
		panel2.add(button3);
		panel2.add(button4);
		panel2.add(button5);
		
		this.add(panel1, BorderLayout.NORTH);  //panel1은 북쪽에 붙이고
		this.add(panel2, BorderLayout.CENTER); //panel2는 센터에 붙임.
	}
}
