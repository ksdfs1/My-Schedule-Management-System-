//과제 일정을 의미하는 Assignment 클래스는 Schedule 클래스의 상속을 받는다. 
//기본 생성자와 부모 클래스의 생성자를 통해 카테고리를 초기화하는 생성자가 있다.(method overloading)
//출력 내용이 부모 클래스와 다르기 때문에 printInfo 메소드를 재정의함.(method overriding)
//printInfo 메소드가 실행될 때는 부모 클래스에 있는 setget_s_category 메소드에 접근함.
//입력 내용이 부모 클래스와 다르기 때문에getUserInput 메소드도 재정의함.(method overriding)
package Schedule;

import java.util.Scanner;

import exception.TimeFormatException;

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
			 try {
				 this.setTime(duetime);
			 } catch (TimeFormatException e) {
				 System.out.println("Incorrect Time format. Put the time that contains ':'");
			 }
		 }
	 }
}
