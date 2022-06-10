package Schedule;

import java.io.Serializable;
import java.util.Scanner;

import exception.TimeFormatException;

//모든 종류의 일정의 부모인 추상화 클래스 
public abstract class Schedule implements ScheduleInput, Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2567649598653654466L;
	
	protected ScheduleCategory category;
	protected int date;
	protected String time;
	protected String place;
	protected String who;
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
	
	public String getPlace() {
		return place;
	}
	
	public void setPlace(String place) {
		this.place = place;
	}
	
	public String getWho() {
		return who;
	}
	
	public void setWho(String who) {
		this.who = who;
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
			 input.nextLine();
			 try {
				 this.setTime(time);
			 } catch (TimeFormatException e) {
				 System.out.println("Incorrect Time format. Put the time that contains ':'. ex)09:00");
			 }
		 }
	 }

	 public void setSchedulePlace(Scanner input) {
		 System.out.print("Input the Place: ");
		 String place = input.nextLine();
		 this.setContent(place);
	 }
	 
	 public void setScheduleWho(Scanner input) {
		 System.out.print("With who: ");
		 input.nextLine();
		 String who = input.nextLine();
		 this.setContent(who);
	 }
	 
	 public void setScheduleContent(Scanner input) {
		 System.out.print("Schedule Content: ");
		 input.nextLine();
		 String content = input.nextLine();
		 this.setContent(content);
	 }
	 
	 public abstract void printInfo();
}
