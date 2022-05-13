//Schedule ī���ڸ����� course�� ����ϴ� Schedule abstract Ŭ���� 
//�⺻ �����ڿ� category�� �ʱ�ȭ�ϴ� ������, �׸��� date, time, content�� �ʱ�ȭ�ϴ� �����ڰ� �ִ�.(method overloading)
//�ʵ忡 ������ category, date, time, content�� ������ �̿� �ش��ϴ� getter, setter �޼ҵ尡 �ִ�.
//printInfo() �޼ҵ带 abstract�� ���� -> �ʵ��� ������ ������ ����ϴ� �޼ҵ���.
//getUserInput() �޼ҵ带 abstract�� ���� -> ����ڿ��� ���� ��¥, �ð� ���� �Է¹��� �� ���Ǵ� �޼ҵ���.
package Schedule;

import java.util.Scanner;

import exception.TimeFormatException;

public abstract class Schedule implements ScheduleInput{
	protected ScheduleCategory category;
	protected int date;
	protected String time;
	protected String content;
	
	public Schedule() {
		
	}
	
	public Schedule(int date, String time, String content) {
		this.date = date;
		this.time = time;
		this.content = content;
	}
	
	public Schedule(ScheduleCategory category) {
		this.category = category;
	}
	
	public ScheduleCategory getCategory() {
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

	public void setTime(String time) throws TimeFormatException {
		if(!time.contains(":")) {
			throw new TimeFormatException();
		}
		this.time = time;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	public void setScheduleDate(Scanner input) {
		 System.out.print("Input the date: ");
		 int date = input.nextInt();
		 this.setDate(date);
	 }
	    
	 public void setScheduleTime(Scanner input) {
		 String time = "";
		 while(!time.contains(":")) {
			 System.out.print("Input the time: ");
			 time = input.next();
			 try {
				 this.setTime(time);
			 } catch (TimeFormatException e) {
				 System.out.println("Incorrect Time format. Put the time that contains ':'. ex)09:00");
			 }
		 }
	 }

	 public void setScheduleContent(Scanner input) {
		 System.out.print("Schedule Content: ");
		 input.nextLine();
		 String content = input.nextLine();
		 this.setContent(content);
	 }
	 
	 public abstract void printInfo();
}
