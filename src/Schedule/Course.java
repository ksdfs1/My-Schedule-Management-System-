package Schedule;

import java.util.Scanner;

public class Course extends Schedule implements ScheduleInput {
	
	public Course() {
		
	}
	
	public Course(ScheduleCategory category) {  //������(category �ʱ�ȭ)
		this.category = category;
	}
	
	public void printInfo() {  //�ʵ尪�� ����ϴ� �޼ҵ�(abstract method ������)
		System.out.print("[Category: " + setget_s_category() + "]  <date>: " + date 
						 + "  <time>: " + time + "  <content>: " + content);
	}
	
	public void getUserInput(Scanner input) {  //��ü�� �����ǰ� ����ڰ� �Է��� �����ϸ� �Է¹޾� �ʵ忡 �����ϴ� �޼ҵ�
		System.out.print("Input the date: ");  
		int date = input.nextInt();
		this.setDate(date);  //setDate �޼ҵ带 ���� �ʵ忡 �� ����
		
		System.out.print("Input the time: ");
		String time = input.next();
		this.setTime(time);  //setTime �޼ҵ带 ���� �ʵ忡 �� ����
		
		System.out.print("Schedule Content: ");
		input.nextLine();
		String content = input.nextLine();
		this.setContent(content);  //setContent �޼ҵ带 ���� �ʵ忡 �� ����
	}
}
