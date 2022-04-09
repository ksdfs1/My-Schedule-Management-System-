package Schedule;

import java.util.Scanner;

public class Schedule {  //Schedule Ŭ����
	protected ScheduleCategory category = ScheduleCategory.Course;  //course�� �⺻ ����Ʈ�� ��.
	protected int date;       //�ʵ忡 ���� ����
	protected String time;
	protected String content;
	
	public Schedule() {  //������
		
	}
	
	public Schedule(int date, String time, String content) {  //������
		this.date = date;
		this.time = time;
		this.content = content;
	}
	
	public ScheduleCategory getCategory() {  //�Ʒ��� �޼ҵ���� �� ������ getter, setter �޼ҵ��̴�
		return category;
	}

	public void setCategory(ScheduleCategory category) {
		this.category = category;
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	public void printInfo() {  //�ʵ尪�� ����ϴ� �޼ҵ�
		System.out.print("-date: " + date + "  -time: " + time + "  -content: " + content);
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
		System.out.println("The new schedule is added."); 
	}
}
