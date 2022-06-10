package Schedule;

import java.util.Scanner;

import exception.TimeFormatException;

//Assignment 일정 클래스
public class Assignment extends Schedule {
	
	public Assignment() {
		
	}
	
	public Assignment(ScheduleCategory category) {
		super(category);
	}
	
	public void printInfo() {
		System.out.print("[Category: " + getCategory() + "]  <due date>: " + date 
						 + "  <due time>: " + time + "  <content>: " + content);
	}
	
	public void getUserInput(Scanner input) {
		setScheduleDate(input);
		setScheduleTime(input);
		setScheduleContent(input);
	}
	public void setScheduleDate(Scanner input) {
		System.out.print("Input the due date: ");
		int duedate = input.nextInt();
		this.setDate(duedate);
	 }
	    
	 public void setScheduleTime(Scanner input) {
		 String duetime = "";
		 while(!duetime.contains(":")) {
			 System.out.print("Input the due time: ");
			 duetime = input.next();
			 input.nextLine();
			 try {
				 this.setTime(duetime);
			 } catch (TimeFormatException e) {
				 System.out.println("Incorrect Time format. Put the time that contains ':'");
			 }
		 }
	 }
}
