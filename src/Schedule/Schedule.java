//Schedule 카테코리에서 course를 담당하는 Schedule abstract 클래스 
//기본 생성자와 category를 초기화하는 생성자, 그리고 date, time, content를 초기화하는 생성자가 있다.(method overloading)
//필드에 변수로 category, date, time, content를 가지고 이에 해당하는 getter, setter 메소드가 있다.
//printInfo() 메소드를 abstract로 선언 -> 필드의 변수로 일정을 출력하는 메소드임.
//getUserInput() 메소드를 abstract로 선언 -> 사용자에게 일정 날짜, 시간 등을 입력받을 때 사용되는 메소드임.
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
