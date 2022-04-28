//Schedule ī���ڸ����� course�� ����ϴ� Schedule Ŭ����
//�⺻ �����ڿ� category�� �ʱ�ȭ�ϴ� ������, �׸��� date, time, content�� �ʱ�ȭ�ϴ� �����ڰ� �ִ�.(method overloading)
//course�� �⺻ ����Ʈ�� �Ͽ� ������ category, date, time, content�� ������ �̿� �ش��ϴ� getter, setter �޼ҵ尡 �ִ�.(category ����)
//printInfo �޼ҵ�� �ʵ尪�� ����ϴ� ����� ������ �ִµ� switch ���� �̿��Ͽ� ī�װ��� ���� category ������ �˸��� String ���� �Ҵ��Ѵ�.
//getUserInput �޼ҵ�� Schedule�� ����Ʈ�� �߰��� �� ����Ǿ� ����ڰ� �Է��� ���� �ʵ��� ������ �Ҵ��Ѵ�.
package Schedule;

import java.util.Scanner;

public class Schedule {  //Schedule Ŭ����
	protected ScheduleCategory category = ScheduleCategory.Course;  //course�� �⺻ ����Ʈ�� ��.
	protected int date;       //�ʵ忡 ���� ����
	protected String time;
	protected String content;
	
	public Schedule() {  //������
		
	}
	
	public Schedule(ScheduleCategory category) {  //������(category �ʱ�ȭ)
		this.category = category;
	}
	
	public Schedule(int date, String time, String content) {  //������(date, time, content �ʱ�ȭ)
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
	
	public String setget_s_category() {  //printInfo�� ������ �� s_category�� set�Ͽ� �����ϴ� �Լ�(�ڽ� Ŭ�����鵵 printInfo ���� �� �����Ѵ�.)
		String s_category = "none";
		switch(this.category) {
		case Course:
			s_category = "Course";
			break;
		case Assignment:
			s_category = "Assignment";
			break;
		case Exam:
			s_category = "Exam";
			break;
		case Promise:
			s_category = "Promise";
			break;
		}
		return s_category;
	}

	public void printInfo() {  //�ʵ尪�� ����ϴ� �޼ҵ�
		System.out.print("[Category: " + setget_s_category() + "]  <date>: " + date + "  <time>: " + time + "  <content>: " + content);
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
