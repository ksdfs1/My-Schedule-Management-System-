package gui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MenuSelection extends JFrame {  //JFrame의 상속을 받는 클래스로 메뉴를 보이는 gui이며 버튼을 통해 입력을 받는다.
										     //가장 위에는 레이블(Menu Selection)이 있고 그 아래는 메뉴를 나타내는 버튼 5개가 있다.
	public MenuSelection() {  //생성자
		this.setSize(300, 200);  //frame 크기 설정
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //frame을 닫으면 프로그램 종료
		
		JPanel panel1 = new JPanel();  //label을 붙일 panel1 생성
		JPanel panel2 = new JPanel();  //button들을 paenl2 생성
		JLabel label = new JLabel("Menu Selection");  //label 생성
		
		JButton button1 = new JButton("Add Schedule");    //button 5개 생성
		JButton button2 = new JButton("Delete Schedule");
		JButton button3 = new JButton("Edit Schedule");
		JButton button4 = new JButton("View Schedule");
		JButton button5 = new JButton("Exit Program");
		
		panel1.add(label);   //label을 panel1에 add
		panel2.add(button1); //button들을 panel2에 add
		panel2.add(button2);
		panel2.add(button3);
		panel2.add(button4);
		panel2.add(button5);
		
		this.add(panel1, BorderLayout.NORTH);  //panel1은 북쪽에 붙이고
		this.add(panel2, BorderLayout.CENTER); //panel2는 센터에 붙임.
		this.setVisible(true);  //frame(윈도우)이 화면상에 보이게 함
	}
}
